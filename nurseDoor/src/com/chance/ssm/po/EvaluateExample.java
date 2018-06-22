package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(String value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(String value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(String value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(String value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(String value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLike(String value) {
            addCriterion("evaluate_id like", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotLike(String value) {
            addCriterion("evaluate_id not like", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<String> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<String> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(String value1, String value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(String value1, String value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridIsNull() {
            addCriterion("evaluate_userid is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridIsNotNull() {
            addCriterion("evaluate_userid is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridEqualTo(String value) {
            addCriterion("evaluate_userid =", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridNotEqualTo(String value) {
            addCriterion("evaluate_userid <>", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridGreaterThan(String value) {
            addCriterion("evaluate_userid >", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_userid >=", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridLessThan(String value) {
            addCriterion("evaluate_userid <", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridLessThanOrEqualTo(String value) {
            addCriterion("evaluate_userid <=", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridLike(String value) {
            addCriterion("evaluate_userid like", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridNotLike(String value) {
            addCriterion("evaluate_userid not like", value, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridIn(List<String> values) {
            addCriterion("evaluate_userid in", values, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridNotIn(List<String> values) {
            addCriterion("evaluate_userid not in", values, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridBetween(String value1, String value2) {
            addCriterion("evaluate_userid between", value1, value2, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateUseridNotBetween(String value1, String value2) {
            addCriterion("evaluate_userid not between", value1, value2, "evaluateUserid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidIsNull() {
            addCriterion("evaluate_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidIsNotNull() {
            addCriterion("evaluate_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidEqualTo(String value) {
            addCriterion("evaluate_nurseid =", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidNotEqualTo(String value) {
            addCriterion("evaluate_nurseid <>", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidGreaterThan(String value) {
            addCriterion("evaluate_nurseid >", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_nurseid >=", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidLessThan(String value) {
            addCriterion("evaluate_nurseid <", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidLessThanOrEqualTo(String value) {
            addCriterion("evaluate_nurseid <=", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidLike(String value) {
            addCriterion("evaluate_nurseid like", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidNotLike(String value) {
            addCriterion("evaluate_nurseid not like", value, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidIn(List<String> values) {
            addCriterion("evaluate_nurseid in", values, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidNotIn(List<String> values) {
            addCriterion("evaluate_nurseid not in", values, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidBetween(String value1, String value2) {
            addCriterion("evaluate_nurseid between", value1, value2, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseidNotBetween(String value1, String value2) {
            addCriterion("evaluate_nurseid not between", value1, value2, "evaluateNurseid");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdIsNull() {
            addCriterion("evaluate_order_send_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdIsNotNull() {
            addCriterion("evaluate_order_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdEqualTo(String value) {
            addCriterion("evaluate_order_send_id =", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdNotEqualTo(String value) {
            addCriterion("evaluate_order_send_id <>", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdGreaterThan(String value) {
            addCriterion("evaluate_order_send_id >", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_order_send_id >=", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdLessThan(String value) {
            addCriterion("evaluate_order_send_id <", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdLessThanOrEqualTo(String value) {
            addCriterion("evaluate_order_send_id <=", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdLike(String value) {
            addCriterion("evaluate_order_send_id like", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdNotLike(String value) {
            addCriterion("evaluate_order_send_id not like", value, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdIn(List<String> values) {
            addCriterion("evaluate_order_send_id in", values, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdNotIn(List<String> values) {
            addCriterion("evaluate_order_send_id not in", values, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdBetween(String value1, String value2) {
            addCriterion("evaluate_order_send_id between", value1, value2, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderSendIdNotBetween(String value1, String value2) {
            addCriterion("evaluate_order_send_id not between", value1, value2, "evaluateOrderSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNull() {
            addCriterion("evaluate_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNotNull() {
            addCriterion("evaluate_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentEqualTo(String value) {
            addCriterion("evaluate_content =", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotEqualTo(String value) {
            addCriterion("evaluate_content <>", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThan(String value) {
            addCriterion("evaluate_content >", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_content >=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThan(String value) {
            addCriterion("evaluate_content <", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThanOrEqualTo(String value) {
            addCriterion("evaluate_content <=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLike(String value) {
            addCriterion("evaluate_content like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotLike(String value) {
            addCriterion("evaluate_content not like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIn(List<String> values) {
            addCriterion("evaluate_content in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotIn(List<String> values) {
            addCriterion("evaluate_content not in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentBetween(String value1, String value2) {
            addCriterion("evaluate_content between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotBetween(String value1, String value2) {
            addCriterion("evaluate_content not between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkIsNull() {
            addCriterion("evaluate_mark is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkIsNotNull() {
            addCriterion("evaluate_mark is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkEqualTo(Long value) {
            addCriterion("evaluate_mark =", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkNotEqualTo(Long value) {
            addCriterion("evaluate_mark <>", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkGreaterThan(Long value) {
            addCriterion("evaluate_mark >", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_mark >=", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkLessThan(Long value) {
            addCriterion("evaluate_mark <", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_mark <=", value, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkIn(List<Long> values) {
            addCriterion("evaluate_mark in", values, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkNotIn(List<Long> values) {
            addCriterion("evaluate_mark not in", values, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkBetween(Long value1, Long value2) {
            addCriterion("evaluate_mark between", value1, value2, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateMarkNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_mark not between", value1, value2, "evaluateMark");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIsNull() {
            addCriterion("evaluate_createtime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIsNotNull() {
            addCriterion("evaluate_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeEqualTo(Date value) {
            addCriterion("evaluate_createtime =", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotEqualTo(Date value) {
            addCriterion("evaluate_createtime <>", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeGreaterThan(Date value) {
            addCriterion("evaluate_createtime >", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_createtime >=", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeLessThan(Date value) {
            addCriterion("evaluate_createtime <", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_createtime <=", value, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeIn(List<Date> values) {
            addCriterion("evaluate_createtime in", values, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotIn(List<Date> values) {
            addCriterion("evaluate_createtime not in", values, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_createtime between", value1, value2, "evaluateCreatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluateCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_createtime not between", value1, value2, "evaluateCreatetime");
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