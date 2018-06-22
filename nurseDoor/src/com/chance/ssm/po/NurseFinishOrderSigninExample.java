package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseFinishOrderSigninExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseFinishOrderSigninExample() {
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

        public Criteria andNurseFinishOrderSigninIsNull() {
            addCriterion("nurse_finish_order_signin is null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninIsNotNull() {
            addCriterion("nurse_finish_order_signin is not null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninEqualTo(String value) {
            addCriterion("nurse_finish_order_signin =", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninNotEqualTo(String value) {
            addCriterion("nurse_finish_order_signin <>", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninGreaterThan(String value) {
            addCriterion("nurse_finish_order_signin >", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_finish_order_signin >=", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninLessThan(String value) {
            addCriterion("nurse_finish_order_signin <", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninLessThanOrEqualTo(String value) {
            addCriterion("nurse_finish_order_signin <=", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninLike(String value) {
            addCriterion("nurse_finish_order_signin like", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninNotLike(String value) {
            addCriterion("nurse_finish_order_signin not like", value, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninIn(List<String> values) {
            addCriterion("nurse_finish_order_signin in", values, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninNotIn(List<String> values) {
            addCriterion("nurse_finish_order_signin not in", values, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninBetween(String value1, String value2) {
            addCriterion("nurse_finish_order_signin between", value1, value2, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderSigninNotBetween(String value1, String value2) {
            addCriterion("nurse_finish_order_signin not between", value1, value2, "nurseFinishOrderSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdIsNull() {
            addCriterion("nurse_finish_order_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdIsNotNull() {
            addCriterion("nurse_finish_order_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdEqualTo(String value) {
            addCriterion("nurse_finish_order_nurse_id =", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdNotEqualTo(String value) {
            addCriterion("nurse_finish_order_nurse_id <>", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdGreaterThan(String value) {
            addCriterion("nurse_finish_order_nurse_id >", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_finish_order_nurse_id >=", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdLessThan(String value) {
            addCriterion("nurse_finish_order_nurse_id <", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_finish_order_nurse_id <=", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdLike(String value) {
            addCriterion("nurse_finish_order_nurse_id like", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdNotLike(String value) {
            addCriterion("nurse_finish_order_nurse_id not like", value, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdIn(List<String> values) {
            addCriterion("nurse_finish_order_nurse_id in", values, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdNotIn(List<String> values) {
            addCriterion("nurse_finish_order_nurse_id not in", values, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdBetween(String value1, String value2) {
            addCriterion("nurse_finish_order_nurse_id between", value1, value2, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseIdNotBetween(String value1, String value2) {
            addCriterion("nurse_finish_order_nurse_id not between", value1, value2, "nurseFinishOrderNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninIsNull() {
            addCriterion("nurse_finish_order_nurse_signin is null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninIsNotNull() {
            addCriterion("nurse_finish_order_nurse_signin is not null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninEqualTo(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin =", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninNotEqualTo(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin <>", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninGreaterThan(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin >", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin >=", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninLessThan(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin <", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_finish_order_nurse_signin <=", value, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninIn(List<Integer> values) {
            addCriterion("nurse_finish_order_nurse_signin in", values, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninNotIn(List<Integer> values) {
            addCriterion("nurse_finish_order_nurse_signin not in", values, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninBetween(Integer value1, Integer value2) {
            addCriterion("nurse_finish_order_nurse_signin between", value1, value2, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderNurseSigninNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_finish_order_nurse_signin not between", value1, value2, "nurseFinishOrderNurseSignin");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeIsNull() {
            addCriterion("nurse_finish_order_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeIsNotNull() {
            addCriterion("nurse_finish_order_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeEqualTo(Date value) {
            addCriterion("nurse_finish_order_createtime =", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeNotEqualTo(Date value) {
            addCriterion("nurse_finish_order_createtime <>", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeGreaterThan(Date value) {
            addCriterion("nurse_finish_order_createtime >", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_finish_order_createtime >=", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeLessThan(Date value) {
            addCriterion("nurse_finish_order_createtime <", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nurse_finish_order_createtime <=", value, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeIn(List<Date> values) {
            addCriterion("nurse_finish_order_createtime in", values, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeNotIn(List<Date> values) {
            addCriterion("nurse_finish_order_createtime not in", values, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nurse_finish_order_createtime between", value1, value2, "nurseFinishOrderCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseFinishOrderCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nurse_finish_order_createtime not between", value1, value2, "nurseFinishOrderCreatetime");
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