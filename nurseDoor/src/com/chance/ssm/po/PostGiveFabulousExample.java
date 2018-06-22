package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostGiveFabulousExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostGiveFabulousExample() {
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

        public Criteria andPostGiveFabulousIdIsNull() {
            addCriterion("post_give_fabulous_id is null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdIsNotNull() {
            addCriterion("post_give_fabulous_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdEqualTo(Integer value) {
            addCriterion("post_give_fabulous_id =", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdNotEqualTo(Integer value) {
            addCriterion("post_give_fabulous_id <>", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdGreaterThan(Integer value) {
            addCriterion("post_give_fabulous_id >", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_give_fabulous_id >=", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdLessThan(Integer value) {
            addCriterion("post_give_fabulous_id <", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_give_fabulous_id <=", value, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdIn(List<Integer> values) {
            addCriterion("post_give_fabulous_id in", values, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdNotIn(List<Integer> values) {
            addCriterion("post_give_fabulous_id not in", values, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdBetween(Integer value1, Integer value2) {
            addCriterion("post_give_fabulous_id between", value1, value2, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_give_fabulous_id not between", value1, value2, "postGiveFabulousId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdIsNull() {
            addCriterion("post_give_fabulous_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdIsNotNull() {
            addCriterion("post_give_fabulous_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdEqualTo(String value) {
            addCriterion("post_give_fabulous_nurse_id =", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdNotEqualTo(String value) {
            addCriterion("post_give_fabulous_nurse_id <>", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdGreaterThan(String value) {
            addCriterion("post_give_fabulous_nurse_id >", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_give_fabulous_nurse_id >=", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdLessThan(String value) {
            addCriterion("post_give_fabulous_nurse_id <", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdLessThanOrEqualTo(String value) {
            addCriterion("post_give_fabulous_nurse_id <=", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdLike(String value) {
            addCriterion("post_give_fabulous_nurse_id like", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdNotLike(String value) {
            addCriterion("post_give_fabulous_nurse_id not like", value, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdIn(List<String> values) {
            addCriterion("post_give_fabulous_nurse_id in", values, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdNotIn(List<String> values) {
            addCriterion("post_give_fabulous_nurse_id not in", values, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdBetween(String value1, String value2) {
            addCriterion("post_give_fabulous_nurse_id between", value1, value2, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousNurseIdNotBetween(String value1, String value2) {
            addCriterion("post_give_fabulous_nurse_id not between", value1, value2, "postGiveFabulousNurseId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdIsNull() {
            addCriterion("post_give_fabulous_post_three_id is null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdIsNotNull() {
            addCriterion("post_give_fabulous_post_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdEqualTo(String value) {
            addCriterion("post_give_fabulous_post_three_id =", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdNotEqualTo(String value) {
            addCriterion("post_give_fabulous_post_three_id <>", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdGreaterThan(String value) {
            addCriterion("post_give_fabulous_post_three_id >", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_give_fabulous_post_three_id >=", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdLessThan(String value) {
            addCriterion("post_give_fabulous_post_three_id <", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdLessThanOrEqualTo(String value) {
            addCriterion("post_give_fabulous_post_three_id <=", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdLike(String value) {
            addCriterion("post_give_fabulous_post_three_id like", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdNotLike(String value) {
            addCriterion("post_give_fabulous_post_three_id not like", value, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdIn(List<String> values) {
            addCriterion("post_give_fabulous_post_three_id in", values, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdNotIn(List<String> values) {
            addCriterion("post_give_fabulous_post_three_id not in", values, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdBetween(String value1, String value2) {
            addCriterion("post_give_fabulous_post_three_id between", value1, value2, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousPostThreeIdNotBetween(String value1, String value2) {
            addCriterion("post_give_fabulous_post_three_id not between", value1, value2, "postGiveFabulousPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeIsNull() {
            addCriterion("post_give_fabulous_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeIsNotNull() {
            addCriterion("post_give_fabulous_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeEqualTo(Date value) {
            addCriterion("post_give_fabulous_createtime =", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeNotEqualTo(Date value) {
            addCriterion("post_give_fabulous_createtime <>", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeGreaterThan(Date value) {
            addCriterion("post_give_fabulous_createtime >", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_give_fabulous_createtime >=", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeLessThan(Date value) {
            addCriterion("post_give_fabulous_createtime <", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_give_fabulous_createtime <=", value, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeIn(List<Date> values) {
            addCriterion("post_give_fabulous_createtime in", values, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeNotIn(List<Date> values) {
            addCriterion("post_give_fabulous_createtime not in", values, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_give_fabulous_createtime between", value1, value2, "postGiveFabulousCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostGiveFabulousCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_give_fabulous_createtime not between", value1, value2, "postGiveFabulousCreatetime");
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