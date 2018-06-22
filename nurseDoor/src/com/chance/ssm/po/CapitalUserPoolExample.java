package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CapitalUserPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalUserPoolExample() {
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

        public Criteria andCapitalUserPoolIdIsNull() {
            addCriterion("capital_user_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdIsNotNull() {
            addCriterion("capital_user_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdEqualTo(String value) {
            addCriterion("capital_user_pool_id =", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdNotEqualTo(String value) {
            addCriterion("capital_user_pool_id <>", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdGreaterThan(String value) {
            addCriterion("capital_user_pool_id >", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_id >=", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdLessThan(String value) {
            addCriterion("capital_user_pool_id <", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdLessThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_id <=", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdLike(String value) {
            addCriterion("capital_user_pool_id like", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdNotLike(String value) {
            addCriterion("capital_user_pool_id not like", value, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdIn(List<String> values) {
            addCriterion("capital_user_pool_id in", values, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdNotIn(List<String> values) {
            addCriterion("capital_user_pool_id not in", values, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdBetween(String value1, String value2) {
            addCriterion("capital_user_pool_id between", value1, value2, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolIdNotBetween(String value1, String value2) {
            addCriterion("capital_user_pool_id not between", value1, value2, "capitalUserPoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidIsNull() {
            addCriterion("capital_user_pool_peopleid is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidIsNotNull() {
            addCriterion("capital_user_pool_peopleid is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidEqualTo(String value) {
            addCriterion("capital_user_pool_peopleid =", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidNotEqualTo(String value) {
            addCriterion("capital_user_pool_peopleid <>", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidGreaterThan(String value) {
            addCriterion("capital_user_pool_peopleid >", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidGreaterThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_peopleid >=", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidLessThan(String value) {
            addCriterion("capital_user_pool_peopleid <", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidLessThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_peopleid <=", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidLike(String value) {
            addCriterion("capital_user_pool_peopleid like", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidNotLike(String value) {
            addCriterion("capital_user_pool_peopleid not like", value, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidIn(List<String> values) {
            addCriterion("capital_user_pool_peopleid in", values, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidNotIn(List<String> values) {
            addCriterion("capital_user_pool_peopleid not in", values, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidBetween(String value1, String value2) {
            addCriterion("capital_user_pool_peopleid between", value1, value2, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleidNotBetween(String value1, String value2) {
            addCriterion("capital_user_pool_peopleid not between", value1, value2, "capitalUserPoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidIsNull() {
            addCriterion("capital_user_pool_ordersendid is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidIsNotNull() {
            addCriterion("capital_user_pool_ordersendid is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidEqualTo(String value) {
            addCriterion("capital_user_pool_ordersendid =", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidNotEqualTo(String value) {
            addCriterion("capital_user_pool_ordersendid <>", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidGreaterThan(String value) {
            addCriterion("capital_user_pool_ordersendid >", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidGreaterThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_ordersendid >=", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidLessThan(String value) {
            addCriterion("capital_user_pool_ordersendid <", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidLessThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_ordersendid <=", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidLike(String value) {
            addCriterion("capital_user_pool_ordersendid like", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidNotLike(String value) {
            addCriterion("capital_user_pool_ordersendid not like", value, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidIn(List<String> values) {
            addCriterion("capital_user_pool_ordersendid in", values, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidNotIn(List<String> values) {
            addCriterion("capital_user_pool_ordersendid not in", values, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidBetween(String value1, String value2) {
            addCriterion("capital_user_pool_ordersendid between", value1, value2, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolOrdersendidNotBetween(String value1, String value2) {
            addCriterion("capital_user_pool_ordersendid not between", value1, value2, "capitalUserPoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityIsNull() {
            addCriterion("capital_user_pool_people_identity is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityIsNotNull() {
            addCriterion("capital_user_pool_people_identity is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityEqualTo(Integer value) {
            addCriterion("capital_user_pool_people_identity =", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityNotEqualTo(Integer value) {
            addCriterion("capital_user_pool_people_identity <>", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityGreaterThan(Integer value) {
            addCriterion("capital_user_pool_people_identity >", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_user_pool_people_identity >=", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityLessThan(Integer value) {
            addCriterion("capital_user_pool_people_identity <", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("capital_user_pool_people_identity <=", value, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityIn(List<Integer> values) {
            addCriterion("capital_user_pool_people_identity in", values, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityNotIn(List<Integer> values) {
            addCriterion("capital_user_pool_people_identity not in", values, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityBetween(Integer value1, Integer value2) {
            addCriterion("capital_user_pool_people_identity between", value1, value2, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolPeopleIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_user_pool_people_identity not between", value1, value2, "capitalUserPoolPeopleIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyIsNull() {
            addCriterion("capital_user_pool_money is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyIsNotNull() {
            addCriterion("capital_user_pool_money is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyEqualTo(BigDecimal value) {
            addCriterion("capital_user_pool_money =", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyNotEqualTo(BigDecimal value) {
            addCriterion("capital_user_pool_money <>", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyGreaterThan(BigDecimal value) {
            addCriterion("capital_user_pool_money >", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_user_pool_money >=", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyLessThan(BigDecimal value) {
            addCriterion("capital_user_pool_money <", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_user_pool_money <=", value, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyIn(List<BigDecimal> values) {
            addCriterion("capital_user_pool_money in", values, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyNotIn(List<BigDecimal> values) {
            addCriterion("capital_user_pool_money not in", values, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_user_pool_money between", value1, value2, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_user_pool_money not between", value1, value2, "capitalUserPoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakIsNull() {
            addCriterion("capital_user_pool_speak is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakIsNotNull() {
            addCriterion("capital_user_pool_speak is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakEqualTo(String value) {
            addCriterion("capital_user_pool_speak =", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakNotEqualTo(String value) {
            addCriterion("capital_user_pool_speak <>", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakGreaterThan(String value) {
            addCriterion("capital_user_pool_speak >", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_speak >=", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakLessThan(String value) {
            addCriterion("capital_user_pool_speak <", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakLessThanOrEqualTo(String value) {
            addCriterion("capital_user_pool_speak <=", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakLike(String value) {
            addCriterion("capital_user_pool_speak like", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakNotLike(String value) {
            addCriterion("capital_user_pool_speak not like", value, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakIn(List<String> values) {
            addCriterion("capital_user_pool_speak in", values, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakNotIn(List<String> values) {
            addCriterion("capital_user_pool_speak not in", values, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakBetween(String value1, String value2) {
            addCriterion("capital_user_pool_speak between", value1, value2, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolSpeakNotBetween(String value1, String value2) {
            addCriterion("capital_user_pool_speak not between", value1, value2, "capitalUserPoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeIsNull() {
            addCriterion("capital_user_pool_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeIsNotNull() {
            addCriterion("capital_user_pool_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeEqualTo(Date value) {
            addCriterion("capital_user_pool_createtime =", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeNotEqualTo(Date value) {
            addCriterion("capital_user_pool_createtime <>", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeGreaterThan(Date value) {
            addCriterion("capital_user_pool_createtime >", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("capital_user_pool_createtime >=", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeLessThan(Date value) {
            addCriterion("capital_user_pool_createtime <", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("capital_user_pool_createtime <=", value, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeIn(List<Date> values) {
            addCriterion("capital_user_pool_createtime in", values, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeNotIn(List<Date> values) {
            addCriterion("capital_user_pool_createtime not in", values, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeBetween(Date value1, Date value2) {
            addCriterion("capital_user_pool_createtime between", value1, value2, "capitalUserPoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalUserPoolCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("capital_user_pool_createtime not between", value1, value2, "capitalUserPoolCreatetime");
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