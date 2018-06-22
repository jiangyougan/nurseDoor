package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseEvaluateExample() {
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

        public Criteria andNurseEvaluateIdIsNull() {
            addCriterion("nurse_evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdIsNotNull() {
            addCriterion("nurse_evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdEqualTo(String value) {
            addCriterion("nurse_evaluate_id =", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdNotEqualTo(String value) {
            addCriterion("nurse_evaluate_id <>", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdGreaterThan(String value) {
            addCriterion("nurse_evaluate_id >", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_evaluate_id >=", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdLessThan(String value) {
            addCriterion("nurse_evaluate_id <", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_evaluate_id <=", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdLike(String value) {
            addCriterion("nurse_evaluate_id like", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdNotLike(String value) {
            addCriterion("nurse_evaluate_id not like", value, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdIn(List<String> values) {
            addCriterion("nurse_evaluate_id in", values, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdNotIn(List<String> values) {
            addCriterion("nurse_evaluate_id not in", values, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdBetween(String value1, String value2) {
            addCriterion("nurse_evaluate_id between", value1, value2, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andNurseEvaluateIdNotBetween(String value1, String value2) {
            addCriterion("nurse_evaluate_id not between", value1, value2, "nurseEvaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdIsNull() {
            addCriterion("evaluate_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdIsNotNull() {
            addCriterion("evaluate_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdEqualTo(String value) {
            addCriterion("evaluate_nurse_id =", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdNotEqualTo(String value) {
            addCriterion("evaluate_nurse_id <>", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdGreaterThan(String value) {
            addCriterion("evaluate_nurse_id >", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_nurse_id >=", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdLessThan(String value) {
            addCriterion("evaluate_nurse_id <", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdLessThanOrEqualTo(String value) {
            addCriterion("evaluate_nurse_id <=", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdLike(String value) {
            addCriterion("evaluate_nurse_id like", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdNotLike(String value) {
            addCriterion("evaluate_nurse_id not like", value, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdIn(List<String> values) {
            addCriterion("evaluate_nurse_id in", values, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdNotIn(List<String> values) {
            addCriterion("evaluate_nurse_id not in", values, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdBetween(String value1, String value2) {
            addCriterion("evaluate_nurse_id between", value1, value2, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluateNurseIdNotBetween(String value1, String value2) {
            addCriterion("evaluate_nurse_id not between", value1, value2, "evaluateNurseId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdIsNull() {
            addCriterion("evalute_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdIsNotNull() {
            addCriterion("evalute_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdEqualTo(String value) {
            addCriterion("evalute_user_id =", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdNotEqualTo(String value) {
            addCriterion("evalute_user_id <>", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdGreaterThan(String value) {
            addCriterion("evalute_user_id >", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("evalute_user_id >=", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdLessThan(String value) {
            addCriterion("evalute_user_id <", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdLessThanOrEqualTo(String value) {
            addCriterion("evalute_user_id <=", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdLike(String value) {
            addCriterion("evalute_user_id like", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdNotLike(String value) {
            addCriterion("evalute_user_id not like", value, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdIn(List<String> values) {
            addCriterion("evalute_user_id in", values, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdNotIn(List<String> values) {
            addCriterion("evalute_user_id not in", values, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdBetween(String value1, String value2) {
            addCriterion("evalute_user_id between", value1, value2, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteUserIdNotBetween(String value1, String value2) {
            addCriterion("evalute_user_id not between", value1, value2, "evaluteUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdIsNull() {
            addCriterion("evalute_send_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdIsNotNull() {
            addCriterion("evalute_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdEqualTo(String value) {
            addCriterion("evalute_send_id =", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdNotEqualTo(String value) {
            addCriterion("evalute_send_id <>", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdGreaterThan(String value) {
            addCriterion("evalute_send_id >", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("evalute_send_id >=", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdLessThan(String value) {
            addCriterion("evalute_send_id <", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdLessThanOrEqualTo(String value) {
            addCriterion("evalute_send_id <=", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdLike(String value) {
            addCriterion("evalute_send_id like", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdNotLike(String value) {
            addCriterion("evalute_send_id not like", value, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdIn(List<String> values) {
            addCriterion("evalute_send_id in", values, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdNotIn(List<String> values) {
            addCriterion("evalute_send_id not in", values, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdBetween(String value1, String value2) {
            addCriterion("evalute_send_id between", value1, value2, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteSendIdNotBetween(String value1, String value2) {
            addCriterion("evalute_send_id not between", value1, value2, "evaluteSendId");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoIsNull() {
            addCriterion("evalute_info is null");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoIsNotNull() {
            addCriterion("evalute_info is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoEqualTo(String value) {
            addCriterion("evalute_info =", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoNotEqualTo(String value) {
            addCriterion("evalute_info <>", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoGreaterThan(String value) {
            addCriterion("evalute_info >", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoGreaterThanOrEqualTo(String value) {
            addCriterion("evalute_info >=", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoLessThan(String value) {
            addCriterion("evalute_info <", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoLessThanOrEqualTo(String value) {
            addCriterion("evalute_info <=", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoLike(String value) {
            addCriterion("evalute_info like", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoNotLike(String value) {
            addCriterion("evalute_info not like", value, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoIn(List<String> values) {
            addCriterion("evalute_info in", values, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoNotIn(List<String> values) {
            addCriterion("evalute_info not in", values, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoBetween(String value1, String value2) {
            addCriterion("evalute_info between", value1, value2, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteInfoNotBetween(String value1, String value2) {
            addCriterion("evalute_info not between", value1, value2, "evaluteInfo");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkIsNull() {
            addCriterion("evalute_mark is null");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkIsNotNull() {
            addCriterion("evalute_mark is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkEqualTo(Integer value) {
            addCriterion("evalute_mark =", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkNotEqualTo(Integer value) {
            addCriterion("evalute_mark <>", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkGreaterThan(Integer value) {
            addCriterion("evalute_mark >", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("evalute_mark >=", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkLessThan(Integer value) {
            addCriterion("evalute_mark <", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkLessThanOrEqualTo(Integer value) {
            addCriterion("evalute_mark <=", value, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkIn(List<Integer> values) {
            addCriterion("evalute_mark in", values, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkNotIn(List<Integer> values) {
            addCriterion("evalute_mark not in", values, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkBetween(Integer value1, Integer value2) {
            addCriterion("evalute_mark between", value1, value2, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("evalute_mark not between", value1, value2, "evaluteMark");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeIsNull() {
            addCriterion("evalute_crtetime is null");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeIsNotNull() {
            addCriterion("evalute_crtetime is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeEqualTo(Date value) {
            addCriterion("evalute_crtetime =", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeNotEqualTo(Date value) {
            addCriterion("evalute_crtetime <>", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeGreaterThan(Date value) {
            addCriterion("evalute_crtetime >", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evalute_crtetime >=", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeLessThan(Date value) {
            addCriterion("evalute_crtetime <", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeLessThanOrEqualTo(Date value) {
            addCriterion("evalute_crtetime <=", value, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeIn(List<Date> values) {
            addCriterion("evalute_crtetime in", values, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeNotIn(List<Date> values) {
            addCriterion("evalute_crtetime not in", values, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeBetween(Date value1, Date value2) {
            addCriterion("evalute_crtetime between", value1, value2, "evaluteCrtetime");
            return (Criteria) this;
        }

        public Criteria andEvaluteCrtetimeNotBetween(Date value1, Date value2) {
            addCriterion("evalute_crtetime not between", value1, value2, "evaluteCrtetime");
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