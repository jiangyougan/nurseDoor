package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowExample() {
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

        public Criteria andFollowIdIsNull() {
            addCriterion("follow_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowIdIsNotNull() {
            addCriterion("follow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowIdEqualTo(String value) {
            addCriterion("follow_id =", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotEqualTo(String value) {
            addCriterion("follow_id <>", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThan(String value) {
            addCriterion("follow_id >", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdGreaterThanOrEqualTo(String value) {
            addCriterion("follow_id >=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThan(String value) {
            addCriterion("follow_id <", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLessThanOrEqualTo(String value) {
            addCriterion("follow_id <=", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdLike(String value) {
            addCriterion("follow_id like", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotLike(String value) {
            addCriterion("follow_id not like", value, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdIn(List<String> values) {
            addCriterion("follow_id in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotIn(List<String> values) {
            addCriterion("follow_id not in", values, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdBetween(String value1, String value2) {
            addCriterion("follow_id between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowIdNotBetween(String value1, String value2) {
            addCriterion("follow_id not between", value1, value2, "followId");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIsNull() {
            addCriterion("follow_followid is null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIsNotNull() {
            addCriterion("follow_followid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidEqualTo(String value) {
            addCriterion("follow_followid =", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidNotEqualTo(String value) {
            addCriterion("follow_followid <>", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidGreaterThan(String value) {
            addCriterion("follow_followid >", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidGreaterThanOrEqualTo(String value) {
            addCriterion("follow_followid >=", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidLessThan(String value) {
            addCriterion("follow_followid <", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidLessThanOrEqualTo(String value) {
            addCriterion("follow_followid <=", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidLike(String value) {
            addCriterion("follow_followid like", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidNotLike(String value) {
            addCriterion("follow_followid not like", value, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIn(List<String> values) {
            addCriterion("follow_followid in", values, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidNotIn(List<String> values) {
            addCriterion("follow_followid not in", values, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidBetween(String value1, String value2) {
            addCriterion("follow_followid between", value1, value2, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidNotBetween(String value1, String value2) {
            addCriterion("follow_followid not between", value1, value2, "followFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenIsNull() {
            addCriterion("follow_followid_iden is null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenIsNotNull() {
            addCriterion("follow_followid_iden is not null");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenEqualTo(Integer value) {
            addCriterion("follow_followid_iden =", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenNotEqualTo(Integer value) {
            addCriterion("follow_followid_iden <>", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenGreaterThan(Integer value) {
            addCriterion("follow_followid_iden >", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_followid_iden >=", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenLessThan(Integer value) {
            addCriterion("follow_followid_iden <", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenLessThanOrEqualTo(Integer value) {
            addCriterion("follow_followid_iden <=", value, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenIn(List<Integer> values) {
            addCriterion("follow_followid_iden in", values, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenNotIn(List<Integer> values) {
            addCriterion("follow_followid_iden not in", values, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenBetween(Integer value1, Integer value2) {
            addCriterion("follow_followid_iden between", value1, value2, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowFollowidIdenNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_followid_iden not between", value1, value2, "followFollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIsNull() {
            addCriterion("follow_befollowid is null");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIsNotNull() {
            addCriterion("follow_befollowid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidEqualTo(String value) {
            addCriterion("follow_befollowid =", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidNotEqualTo(String value) {
            addCriterion("follow_befollowid <>", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidGreaterThan(String value) {
            addCriterion("follow_befollowid >", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidGreaterThanOrEqualTo(String value) {
            addCriterion("follow_befollowid >=", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidLessThan(String value) {
            addCriterion("follow_befollowid <", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidLessThanOrEqualTo(String value) {
            addCriterion("follow_befollowid <=", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidLike(String value) {
            addCriterion("follow_befollowid like", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidNotLike(String value) {
            addCriterion("follow_befollowid not like", value, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIn(List<String> values) {
            addCriterion("follow_befollowid in", values, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidNotIn(List<String> values) {
            addCriterion("follow_befollowid not in", values, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidBetween(String value1, String value2) {
            addCriterion("follow_befollowid between", value1, value2, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidNotBetween(String value1, String value2) {
            addCriterion("follow_befollowid not between", value1, value2, "followBefollowid");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenIsNull() {
            addCriterion("follow_befollowid_iden is null");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenIsNotNull() {
            addCriterion("follow_befollowid_iden is not null");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenEqualTo(Integer value) {
            addCriterion("follow_befollowid_iden =", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenNotEqualTo(Integer value) {
            addCriterion("follow_befollowid_iden <>", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenGreaterThan(Integer value) {
            addCriterion("follow_befollowid_iden >", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_befollowid_iden >=", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenLessThan(Integer value) {
            addCriterion("follow_befollowid_iden <", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenLessThanOrEqualTo(Integer value) {
            addCriterion("follow_befollowid_iden <=", value, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenIn(List<Integer> values) {
            addCriterion("follow_befollowid_iden in", values, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenNotIn(List<Integer> values) {
            addCriterion("follow_befollowid_iden not in", values, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenBetween(Integer value1, Integer value2) {
            addCriterion("follow_befollowid_iden between", value1, value2, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowBefollowidIdenNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_befollowid_iden not between", value1, value2, "followBefollowidIden");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeIsNull() {
            addCriterion("follow_createtime is null");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeIsNotNull() {
            addCriterion("follow_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeEqualTo(Date value) {
            addCriterion("follow_createtime =", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeNotEqualTo(Date value) {
            addCriterion("follow_createtime <>", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeGreaterThan(Date value) {
            addCriterion("follow_createtime >", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_createtime >=", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeLessThan(Date value) {
            addCriterion("follow_createtime <", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("follow_createtime <=", value, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeIn(List<Date> values) {
            addCriterion("follow_createtime in", values, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeNotIn(List<Date> values) {
            addCriterion("follow_createtime not in", values, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeBetween(Date value1, Date value2) {
            addCriterion("follow_createtime between", value1, value2, "followCreatetime");
            return (Criteria) this;
        }

        public Criteria andFollowCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("follow_createtime not between", value1, value2, "followCreatetime");
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