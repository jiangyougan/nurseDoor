package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseSigninExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseSigninExample() {
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

        public Criteria andNurseIdIsNull() {
            addCriterion("nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseIdIsNotNull() {
            addCriterion("nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseIdEqualTo(String value) {
            addCriterion("nurse_id =", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotEqualTo(String value) {
            addCriterion("nurse_id <>", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThan(String value) {
            addCriterion("nurse_id >", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_id >=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThan(String value) {
            addCriterion("nurse_id <", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_id <=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLike(String value) {
            addCriterion("nurse_id like", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotLike(String value) {
            addCriterion("nurse_id not like", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdIn(List<String> values) {
            addCriterion("nurse_id in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotIn(List<String> values) {
            addCriterion("nurse_id not in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdBetween(String value1, String value2) {
            addCriterion("nurse_id between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotBetween(String value1, String value2) {
            addCriterion("nurse_id not between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralIsNull() {
            addCriterion("signin_integral is null");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralIsNotNull() {
            addCriterion("signin_integral is not null");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralEqualTo(Integer value) {
            addCriterion("signin_integral =", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralNotEqualTo(Integer value) {
            addCriterion("signin_integral <>", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralGreaterThan(Integer value) {
            addCriterion("signin_integral >", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("signin_integral >=", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralLessThan(Integer value) {
            addCriterion("signin_integral <", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("signin_integral <=", value, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralIn(List<Integer> values) {
            addCriterion("signin_integral in", values, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralNotIn(List<Integer> values) {
            addCriterion("signin_integral not in", values, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralBetween(Integer value1, Integer value2) {
            addCriterion("signin_integral between", value1, value2, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("signin_integral not between", value1, value2, "signinIntegral");
            return (Criteria) this;
        }

        public Criteria andSigninTimeIsNull() {
            addCriterion("signin_time is null");
            return (Criteria) this;
        }

        public Criteria andSigninTimeIsNotNull() {
            addCriterion("signin_time is not null");
            return (Criteria) this;
        }

        public Criteria andSigninTimeEqualTo(Date value) {
            addCriterion("signin_time =", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeNotEqualTo(Date value) {
            addCriterion("signin_time <>", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeGreaterThan(Date value) {
            addCriterion("signin_time >", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signin_time >=", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeLessThan(Date value) {
            addCriterion("signin_time <", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeLessThanOrEqualTo(Date value) {
            addCriterion("signin_time <=", value, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeIn(List<Date> values) {
            addCriterion("signin_time in", values, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeNotIn(List<Date> values) {
            addCriterion("signin_time not in", values, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeBetween(Date value1, Date value2) {
            addCriterion("signin_time between", value1, value2, "signinTime");
            return (Criteria) this;
        }

        public Criteria andSigninTimeNotBetween(Date value1, Date value2) {
            addCriterion("signin_time not between", value1, value2, "signinTime");
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