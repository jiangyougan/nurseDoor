package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSendSpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSendSpecialExample() {
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

        public Criteria andOrderSendSpecialIdIsNull() {
            addCriterion("order_send_special_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdIsNotNull() {
            addCriterion("order_send_special_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdEqualTo(String value) {
            addCriterion("order_send_special_id =", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdNotEqualTo(String value) {
            addCriterion("order_send_special_id <>", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdGreaterThan(String value) {
            addCriterion("order_send_special_id >", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_special_id >=", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdLessThan(String value) {
            addCriterion("order_send_special_id <", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdLessThanOrEqualTo(String value) {
            addCriterion("order_send_special_id <=", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdLike(String value) {
            addCriterion("order_send_special_id like", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdNotLike(String value) {
            addCriterion("order_send_special_id not like", value, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdIn(List<String> values) {
            addCriterion("order_send_special_id in", values, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdNotIn(List<String> values) {
            addCriterion("order_send_special_id not in", values, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdBetween(String value1, String value2) {
            addCriterion("order_send_special_id between", value1, value2, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialIdNotBetween(String value1, String value2) {
            addCriterion("order_send_special_id not between", value1, value2, "orderSendSpecialId");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidIsNull() {
            addCriterion("order_send_special_ordersendid is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidIsNotNull() {
            addCriterion("order_send_special_ordersendid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidEqualTo(String value) {
            addCriterion("order_send_special_ordersendid =", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidNotEqualTo(String value) {
            addCriterion("order_send_special_ordersendid <>", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidGreaterThan(String value) {
            addCriterion("order_send_special_ordersendid >", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_special_ordersendid >=", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidLessThan(String value) {
            addCriterion("order_send_special_ordersendid <", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidLessThanOrEqualTo(String value) {
            addCriterion("order_send_special_ordersendid <=", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidLike(String value) {
            addCriterion("order_send_special_ordersendid like", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidNotLike(String value) {
            addCriterion("order_send_special_ordersendid not like", value, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidIn(List<String> values) {
            addCriterion("order_send_special_ordersendid in", values, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidNotIn(List<String> values) {
            addCriterion("order_send_special_ordersendid not in", values, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidBetween(String value1, String value2) {
            addCriterion("order_send_special_ordersendid between", value1, value2, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialOrdersendidNotBetween(String value1, String value2) {
            addCriterion("order_send_special_ordersendid not between", value1, value2, "orderSendSpecialOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidIsNull() {
            addCriterion("order_send_special_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidIsNotNull() {
            addCriterion("order_send_special_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidEqualTo(String value) {
            addCriterion("order_send_special_nurseid =", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidNotEqualTo(String value) {
            addCriterion("order_send_special_nurseid <>", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidGreaterThan(String value) {
            addCriterion("order_send_special_nurseid >", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_special_nurseid >=", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidLessThan(String value) {
            addCriterion("order_send_special_nurseid <", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidLessThanOrEqualTo(String value) {
            addCriterion("order_send_special_nurseid <=", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidLike(String value) {
            addCriterion("order_send_special_nurseid like", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidNotLike(String value) {
            addCriterion("order_send_special_nurseid not like", value, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidIn(List<String> values) {
            addCriterion("order_send_special_nurseid in", values, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidNotIn(List<String> values) {
            addCriterion("order_send_special_nurseid not in", values, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidBetween(String value1, String value2) {
            addCriterion("order_send_special_nurseid between", value1, value2, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialNurseidNotBetween(String value1, String value2) {
            addCriterion("order_send_special_nurseid not between", value1, value2, "orderSendSpecialNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeIsNull() {
            addCriterion("order_send_special_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeIsNotNull() {
            addCriterion("order_send_special_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeEqualTo(Date value) {
            addCriterion("order_send_special_createtime =", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeNotEqualTo(Date value) {
            addCriterion("order_send_special_createtime <>", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeGreaterThan(Date value) {
            addCriterion("order_send_special_createtime >", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_special_createtime >=", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeLessThan(Date value) {
            addCriterion("order_send_special_createtime <", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_special_createtime <=", value, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeIn(List<Date> values) {
            addCriterion("order_send_special_createtime in", values, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeNotIn(List<Date> values) {
            addCriterion("order_send_special_createtime not in", values, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeBetween(Date value1, Date value2) {
            addCriterion("order_send_special_createtime between", value1, value2, "orderSendSpecialCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendSpecialCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_special_createtime not between", value1, value2, "orderSendSpecialCreatetime");
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