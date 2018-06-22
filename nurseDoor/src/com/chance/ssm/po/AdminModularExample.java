package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminModularExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminModularExample() {
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

        public Criteria andModularIdIsNull() {
            addCriterion("modular_id is null");
            return (Criteria) this;
        }

        public Criteria andModularIdIsNotNull() {
            addCriterion("modular_id is not null");
            return (Criteria) this;
        }

        public Criteria andModularIdEqualTo(String value) {
            addCriterion("modular_id =", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdNotEqualTo(String value) {
            addCriterion("modular_id <>", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdGreaterThan(String value) {
            addCriterion("modular_id >", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdGreaterThanOrEqualTo(String value) {
            addCriterion("modular_id >=", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdLessThan(String value) {
            addCriterion("modular_id <", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdLessThanOrEqualTo(String value) {
            addCriterion("modular_id <=", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdLike(String value) {
            addCriterion("modular_id like", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdNotLike(String value) {
            addCriterion("modular_id not like", value, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdIn(List<String> values) {
            addCriterion("modular_id in", values, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdNotIn(List<String> values) {
            addCriterion("modular_id not in", values, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdBetween(String value1, String value2) {
            addCriterion("modular_id between", value1, value2, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularIdNotBetween(String value1, String value2) {
            addCriterion("modular_id not between", value1, value2, "modularId");
            return (Criteria) this;
        }

        public Criteria andModularNameIsNull() {
            addCriterion("modular_name is null");
            return (Criteria) this;
        }

        public Criteria andModularNameIsNotNull() {
            addCriterion("modular_name is not null");
            return (Criteria) this;
        }

        public Criteria andModularNameEqualTo(String value) {
            addCriterion("modular_name =", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotEqualTo(String value) {
            addCriterion("modular_name <>", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameGreaterThan(String value) {
            addCriterion("modular_name >", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameGreaterThanOrEqualTo(String value) {
            addCriterion("modular_name >=", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLessThan(String value) {
            addCriterion("modular_name <", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLessThanOrEqualTo(String value) {
            addCriterion("modular_name <=", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameLike(String value) {
            addCriterion("modular_name like", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotLike(String value) {
            addCriterion("modular_name not like", value, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameIn(List<String> values) {
            addCriterion("modular_name in", values, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotIn(List<String> values) {
            addCriterion("modular_name not in", values, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameBetween(String value1, String value2) {
            addCriterion("modular_name between", value1, value2, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularNameNotBetween(String value1, String value2) {
            addCriterion("modular_name not between", value1, value2, "modularName");
            return (Criteria) this;
        }

        public Criteria andModularCreaterIsNull() {
            addCriterion("modular_creater is null");
            return (Criteria) this;
        }

        public Criteria andModularCreaterIsNotNull() {
            addCriterion("modular_creater is not null");
            return (Criteria) this;
        }

        public Criteria andModularCreaterEqualTo(String value) {
            addCriterion("modular_creater =", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterNotEqualTo(String value) {
            addCriterion("modular_creater <>", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterGreaterThan(String value) {
            addCriterion("modular_creater >", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("modular_creater >=", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterLessThan(String value) {
            addCriterion("modular_creater <", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterLessThanOrEqualTo(String value) {
            addCriterion("modular_creater <=", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterLike(String value) {
            addCriterion("modular_creater like", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterNotLike(String value) {
            addCriterion("modular_creater not like", value, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterIn(List<String> values) {
            addCriterion("modular_creater in", values, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterNotIn(List<String> values) {
            addCriterion("modular_creater not in", values, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterBetween(String value1, String value2) {
            addCriterion("modular_creater between", value1, value2, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreaterNotBetween(String value1, String value2) {
            addCriterion("modular_creater not between", value1, value2, "modularCreater");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeIsNull() {
            addCriterion("modular_createtime is null");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeIsNotNull() {
            addCriterion("modular_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeEqualTo(Date value) {
            addCriterion("modular_createtime =", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeNotEqualTo(Date value) {
            addCriterion("modular_createtime <>", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeGreaterThan(Date value) {
            addCriterion("modular_createtime >", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modular_createtime >=", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeLessThan(Date value) {
            addCriterion("modular_createtime <", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("modular_createtime <=", value, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeIn(List<Date> values) {
            addCriterion("modular_createtime in", values, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeNotIn(List<Date> values) {
            addCriterion("modular_createtime not in", values, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeBetween(Date value1, Date value2) {
            addCriterion("modular_createtime between", value1, value2, "modularCreatetime");
            return (Criteria) this;
        }

        public Criteria andModularCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("modular_createtime not between", value1, value2, "modularCreatetime");
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