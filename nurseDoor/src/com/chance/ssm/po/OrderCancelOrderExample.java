package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCancelOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCancelOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderCancelOrderSendIdIsNull() {
            addCriterion("order_cancel_order_send_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdIsNotNull() {
            addCriterion("order_cancel_order_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdEqualTo(String value) {
            addCriterion("order_cancel_order_send_id =", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdNotEqualTo(String value) {
            addCriterion("order_cancel_order_send_id <>", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdGreaterThan(String value) {
            addCriterion("order_cancel_order_send_id >", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_send_id >=", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdLessThan(String value) {
            addCriterion("order_cancel_order_send_id <", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdLessThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_send_id <=", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdLike(String value) {
            addCriterion("order_cancel_order_send_id like", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdNotLike(String value) {
            addCriterion("order_cancel_order_send_id not like", value, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdIn(List<String> values) {
            addCriterion("order_cancel_order_send_id in", values, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdNotIn(List<String> values) {
            addCriterion("order_cancel_order_send_id not in", values, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdBetween(String value1, String value2) {
            addCriterion("order_cancel_order_send_id between", value1, value2, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSendIdNotBetween(String value1, String value2) {
            addCriterion("order_cancel_order_send_id not between", value1, value2, "orderCancelOrderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateIsNull() {
            addCriterion("order_cancal_order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateIsNotNull() {
            addCriterion("order_cancal_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateEqualTo(Integer value) {
            addCriterion("order_cancal_order_state =", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateNotEqualTo(Integer value) {
            addCriterion("order_cancal_order_state <>", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateGreaterThan(Integer value) {
            addCriterion("order_cancal_order_state >", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_order_state >=", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateLessThan(Integer value) {
            addCriterion("order_cancal_order_state <", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_order_state <=", value, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateIn(List<Integer> values) {
            addCriterion("order_cancal_order_state in", values, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateNotIn(List<Integer> values) {
            addCriterion("order_cancal_order_state not in", values, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_order_state between", value1, value2, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_order_state not between", value1, value2, "orderCancalOrderState");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeIsNull() {
            addCriterion("order_cancal_nurse_agree is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeIsNotNull() {
            addCriterion("order_cancal_nurse_agree is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeEqualTo(Integer value) {
            addCriterion("order_cancal_nurse_agree =", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeNotEqualTo(Integer value) {
            addCriterion("order_cancal_nurse_agree <>", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeGreaterThan(Integer value) {
            addCriterion("order_cancal_nurse_agree >", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_nurse_agree >=", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeLessThan(Integer value) {
            addCriterion("order_cancal_nurse_agree <", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_nurse_agree <=", value, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeIn(List<Integer> values) {
            addCriterion("order_cancal_nurse_agree in", values, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeNotIn(List<Integer> values) {
            addCriterion("order_cancal_nurse_agree not in", values, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_nurse_agree between", value1, value2, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_nurse_agree not between", value1, value2, "orderCancalNurseAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeIsNull() {
            addCriterion("order_cancal_nurse_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeIsNotNull() {
            addCriterion("order_cancal_nurse_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeEqualTo(Date value) {
            addCriterion("order_cancal_nurse_cancel_time =", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeNotEqualTo(Date value) {
            addCriterion("order_cancal_nurse_cancel_time <>", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeGreaterThan(Date value) {
            addCriterion("order_cancal_nurse_cancel_time >", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancal_nurse_cancel_time >=", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeLessThan(Date value) {
            addCriterion("order_cancal_nurse_cancel_time <", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancal_nurse_cancel_time <=", value, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeIn(List<Date> values) {
            addCriterion("order_cancal_nurse_cancel_time in", values, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeNotIn(List<Date> values) {
            addCriterion("order_cancal_nurse_cancel_time not in", values, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancal_nurse_cancel_time between", value1, value2, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancal_nurse_cancel_time not between", value1, value2, "orderCancalNurseCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeIsNull() {
            addCriterion("order_cancal_nurse_agree_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeIsNotNull() {
            addCriterion("order_cancal_nurse_agree_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeEqualTo(Date value) {
            addCriterion("order_cancal_nurse_agree_time =", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeNotEqualTo(Date value) {
            addCriterion("order_cancal_nurse_agree_time <>", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeGreaterThan(Date value) {
            addCriterion("order_cancal_nurse_agree_time >", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancal_nurse_agree_time >=", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeLessThan(Date value) {
            addCriterion("order_cancal_nurse_agree_time <", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancal_nurse_agree_time <=", value, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeIn(List<Date> values) {
            addCriterion("order_cancal_nurse_agree_time in", values, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeNotIn(List<Date> values) {
            addCriterion("order_cancal_nurse_agree_time not in", values, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancal_nurse_agree_time between", value1, value2, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalNurseAgreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancal_nurse_agree_time not between", value1, value2, "orderCancalNurseAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeIsNull() {
            addCriterion("order_cancal_user_agree is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeIsNotNull() {
            addCriterion("order_cancal_user_agree is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeEqualTo(Integer value) {
            addCriterion("order_cancal_user_agree =", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeNotEqualTo(Integer value) {
            addCriterion("order_cancal_user_agree <>", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeGreaterThan(Integer value) {
            addCriterion("order_cancal_user_agree >", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_user_agree >=", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeLessThan(Integer value) {
            addCriterion("order_cancal_user_agree <", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_user_agree <=", value, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeIn(List<Integer> values) {
            addCriterion("order_cancal_user_agree in", values, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeNotIn(List<Integer> values) {
            addCriterion("order_cancal_user_agree not in", values, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_user_agree between", value1, value2, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_user_agree not between", value1, value2, "orderCancalUserAgree");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeIsNull() {
            addCriterion("order_cancal_user_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeIsNotNull() {
            addCriterion("order_cancal_user_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeEqualTo(Date value) {
            addCriterion("order_cancal_user_cancel_time =", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeNotEqualTo(Date value) {
            addCriterion("order_cancal_user_cancel_time <>", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeGreaterThan(Date value) {
            addCriterion("order_cancal_user_cancel_time >", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancal_user_cancel_time >=", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeLessThan(Date value) {
            addCriterion("order_cancal_user_cancel_time <", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancal_user_cancel_time <=", value, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeIn(List<Date> values) {
            addCriterion("order_cancal_user_cancel_time in", values, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeNotIn(List<Date> values) {
            addCriterion("order_cancal_user_cancel_time not in", values, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancal_user_cancel_time between", value1, value2, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancal_user_cancel_time not between", value1, value2, "orderCancalUserCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeIsNull() {
            addCriterion("order_cancal_user_agree_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeIsNotNull() {
            addCriterion("order_cancal_user_agree_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeEqualTo(Date value) {
            addCriterion("order_cancal_user_agree_time =", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeNotEqualTo(Date value) {
            addCriterion("order_cancal_user_agree_time <>", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeGreaterThan(Date value) {
            addCriterion("order_cancal_user_agree_time >", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancal_user_agree_time >=", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeLessThan(Date value) {
            addCriterion("order_cancal_user_agree_time <", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancal_user_agree_time <=", value, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeIn(List<Date> values) {
            addCriterion("order_cancal_user_agree_time in", values, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeNotIn(List<Date> values) {
            addCriterion("order_cancal_user_agree_time not in", values, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancal_user_agree_time between", value1, value2, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalUserAgreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancal_user_agree_time not between", value1, value2, "orderCancalUserAgreeTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleIsNull() {
            addCriterion("order_cancal_handle_people is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleIsNotNull() {
            addCriterion("order_cancal_handle_people is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleEqualTo(String value) {
            addCriterion("order_cancal_handle_people =", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleNotEqualTo(String value) {
            addCriterion("order_cancal_handle_people <>", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleGreaterThan(String value) {
            addCriterion("order_cancal_handle_people >", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancal_handle_people >=", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleLessThan(String value) {
            addCriterion("order_cancal_handle_people <", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleLessThanOrEqualTo(String value) {
            addCriterion("order_cancal_handle_people <=", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleLike(String value) {
            addCriterion("order_cancal_handle_people like", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleNotLike(String value) {
            addCriterion("order_cancal_handle_people not like", value, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleIn(List<String> values) {
            addCriterion("order_cancal_handle_people in", values, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleNotIn(List<String> values) {
            addCriterion("order_cancal_handle_people not in", values, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleBetween(String value1, String value2) {
            addCriterion("order_cancal_handle_people between", value1, value2, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandlePeopleNotBetween(String value1, String value2) {
            addCriterion("order_cancal_handle_people not between", value1, value2, "orderCancalHandlePeople");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundIsNull() {
            addCriterion("order_cancal_whether_refund is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundIsNotNull() {
            addCriterion("order_cancal_whether_refund is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundEqualTo(Integer value) {
            addCriterion("order_cancal_whether_refund =", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundNotEqualTo(Integer value) {
            addCriterion("order_cancal_whether_refund <>", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundGreaterThan(Integer value) {
            addCriterion("order_cancal_whether_refund >", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_whether_refund >=", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundLessThan(Integer value) {
            addCriterion("order_cancal_whether_refund <", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundLessThanOrEqualTo(Integer value) {
            addCriterion("order_cancal_whether_refund <=", value, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundIn(List<Integer> values) {
            addCriterion("order_cancal_whether_refund in", values, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundNotIn(List<Integer> values) {
            addCriterion("order_cancal_whether_refund not in", values, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_whether_refund between", value1, value2, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalWhetherRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cancal_whether_refund not between", value1, value2, "orderCancalWhetherRefund");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyIsNull() {
            addCriterion("order_cancal_refund_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyIsNotNull() {
            addCriterion("order_cancal_refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyEqualTo(BigDecimal value) {
            addCriterion("order_cancal_refund_money =", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_cancal_refund_money <>", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_cancal_refund_money >", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cancal_refund_money >=", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyLessThan(BigDecimal value) {
            addCriterion("order_cancal_refund_money <", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cancal_refund_money <=", value, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyIn(List<BigDecimal> values) {
            addCriterion("order_cancal_refund_money in", values, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_cancal_refund_money not in", values, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cancal_refund_money between", value1, value2, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalRefundMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cancal_refund_money not between", value1, value2, "orderCancalRefundMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultIsNull() {
            addCriterion("order_cancal_handle_result is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultIsNotNull() {
            addCriterion("order_cancal_handle_result is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultEqualTo(String value) {
            addCriterion("order_cancal_handle_result =", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultNotEqualTo(String value) {
            addCriterion("order_cancal_handle_result <>", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultGreaterThan(String value) {
            addCriterion("order_cancal_handle_result >", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancal_handle_result >=", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultLessThan(String value) {
            addCriterion("order_cancal_handle_result <", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultLessThanOrEqualTo(String value) {
            addCriterion("order_cancal_handle_result <=", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultLike(String value) {
            addCriterion("order_cancal_handle_result like", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultNotLike(String value) {
            addCriterion("order_cancal_handle_result not like", value, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultIn(List<String> values) {
            addCriterion("order_cancal_handle_result in", values, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultNotIn(List<String> values) {
            addCriterion("order_cancal_handle_result not in", values, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultBetween(String value1, String value2) {
            addCriterion("order_cancal_handle_result between", value1, value2, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultNotBetween(String value1, String value2) {
            addCriterion("order_cancal_handle_result not between", value1, value2, "orderCancalHandleResult");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteIsNull() {
            addCriterion("order_cancel_order_note is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteIsNotNull() {
            addCriterion("order_cancel_order_note is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteEqualTo(String value) {
            addCriterion("order_cancel_order_note =", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteNotEqualTo(String value) {
            addCriterion("order_cancel_order_note <>", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteGreaterThan(String value) {
            addCriterion("order_cancel_order_note >", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_note >=", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteLessThan(String value) {
            addCriterion("order_cancel_order_note <", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteLessThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_note <=", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteLike(String value) {
            addCriterion("order_cancel_order_note like", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteNotLike(String value) {
            addCriterion("order_cancel_order_note not like", value, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteIn(List<String> values) {
            addCriterion("order_cancel_order_note in", values, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteNotIn(List<String> values) {
            addCriterion("order_cancel_order_note not in", values, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteBetween(String value1, String value2) {
            addCriterion("order_cancel_order_note between", value1, value2, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderNoteNotBetween(String value1, String value2) {
            addCriterion("order_cancel_order_note not between", value1, value2, "orderCancelOrderNote");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakIsNull() {
            addCriterion("order_cancel_order_speak is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakIsNotNull() {
            addCriterion("order_cancel_order_speak is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakEqualTo(String value) {
            addCriterion("order_cancel_order_speak =", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakNotEqualTo(String value) {
            addCriterion("order_cancel_order_speak <>", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakGreaterThan(String value) {
            addCriterion("order_cancel_order_speak >", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_speak >=", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakLessThan(String value) {
            addCriterion("order_cancel_order_speak <", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakLessThanOrEqualTo(String value) {
            addCriterion("order_cancel_order_speak <=", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakLike(String value) {
            addCriterion("order_cancel_order_speak like", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakNotLike(String value) {
            addCriterion("order_cancel_order_speak not like", value, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakIn(List<String> values) {
            addCriterion("order_cancel_order_speak in", values, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakNotIn(List<String> values) {
            addCriterion("order_cancel_order_speak not in", values, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakBetween(String value1, String value2) {
            addCriterion("order_cancel_order_speak between", value1, value2, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancelOrderSpeakNotBetween(String value1, String value2) {
            addCriterion("order_cancel_order_speak not between", value1, value2, "orderCancelOrderSpeak");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeIsNull() {
            addCriterion("order_cancal_handle_result_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeIsNotNull() {
            addCriterion("order_cancal_handle_result_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeEqualTo(Date value) {
            addCriterion("order_cancal_handle_result_time =", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeNotEqualTo(Date value) {
            addCriterion("order_cancal_handle_result_time <>", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeGreaterThan(Date value) {
            addCriterion("order_cancal_handle_result_time >", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancal_handle_result_time >=", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeLessThan(Date value) {
            addCriterion("order_cancal_handle_result_time <", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancal_handle_result_time <=", value, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeIn(List<Date> values) {
            addCriterion("order_cancal_handle_result_time in", values, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeNotIn(List<Date> values) {
            addCriterion("order_cancal_handle_result_time not in", values, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancal_handle_result_time between", value1, value2, "orderCancalHandleResultTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancalHandleResultTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancal_handle_result_time not between", value1, value2, "orderCancalHandleResultTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}