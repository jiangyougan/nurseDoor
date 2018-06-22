package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CapitalNursePoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalNursePoolExample() {
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

        public Criteria andCapitalNursePoolIdIsNull() {
            addCriterion("capital_nurse_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdIsNotNull() {
            addCriterion("capital_nurse_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdEqualTo(String value) {
            addCriterion("capital_nurse_pool_id =", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdNotEqualTo(String value) {
            addCriterion("capital_nurse_pool_id <>", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdGreaterThan(String value) {
            addCriterion("capital_nurse_pool_id >", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_id >=", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdLessThan(String value) {
            addCriterion("capital_nurse_pool_id <", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdLessThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_id <=", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdLike(String value) {
            addCriterion("capital_nurse_pool_id like", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdNotLike(String value) {
            addCriterion("capital_nurse_pool_id not like", value, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdIn(List<String> values) {
            addCriterion("capital_nurse_pool_id in", values, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdNotIn(List<String> values) {
            addCriterion("capital_nurse_pool_id not in", values, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_id between", value1, value2, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolIdNotBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_id not between", value1, value2, "capitalNursePoolId");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIsNull() {
            addCriterion("capital_nurse_pool_peopleid is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIsNotNull() {
            addCriterion("capital_nurse_pool_peopleid is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidEqualTo(String value) {
            addCriterion("capital_nurse_pool_peopleid =", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidNotEqualTo(String value) {
            addCriterion("capital_nurse_pool_peopleid <>", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidGreaterThan(String value) {
            addCriterion("capital_nurse_pool_peopleid >", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidGreaterThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_peopleid >=", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidLessThan(String value) {
            addCriterion("capital_nurse_pool_peopleid <", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidLessThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_peopleid <=", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidLike(String value) {
            addCriterion("capital_nurse_pool_peopleid like", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidNotLike(String value) {
            addCriterion("capital_nurse_pool_peopleid not like", value, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIn(List<String> values) {
            addCriterion("capital_nurse_pool_peopleid in", values, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidNotIn(List<String> values) {
            addCriterion("capital_nurse_pool_peopleid not in", values, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_peopleid between", value1, value2, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidNotBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_peopleid not between", value1, value2, "capitalNursePoolPeopleid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidIsNull() {
            addCriterion("capital_nurse_pool_ordersendid is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidIsNotNull() {
            addCriterion("capital_nurse_pool_ordersendid is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidEqualTo(String value) {
            addCriterion("capital_nurse_pool_ordersendid =", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidNotEqualTo(String value) {
            addCriterion("capital_nurse_pool_ordersendid <>", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidGreaterThan(String value) {
            addCriterion("capital_nurse_pool_ordersendid >", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidGreaterThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_ordersendid >=", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidLessThan(String value) {
            addCriterion("capital_nurse_pool_ordersendid <", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidLessThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_ordersendid <=", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidLike(String value) {
            addCriterion("capital_nurse_pool_ordersendid like", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidNotLike(String value) {
            addCriterion("capital_nurse_pool_ordersendid not like", value, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidIn(List<String> values) {
            addCriterion("capital_nurse_pool_ordersendid in", values, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidNotIn(List<String> values) {
            addCriterion("capital_nurse_pool_ordersendid not in", values, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_ordersendid between", value1, value2, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolOrdersendidNotBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_ordersendid not between", value1, value2, "capitalNursePoolOrdersendid");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityIsNull() {
            addCriterion("capital_nurse_pool_peopleid_identity is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityIsNotNull() {
            addCriterion("capital_nurse_pool_peopleid_identity is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity =", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityNotEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity <>", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityGreaterThan(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity >", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity >=", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityLessThan(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity <", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_peopleid_identity <=", value, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityIn(List<Integer> values) {
            addCriterion("capital_nurse_pool_peopleid_identity in", values, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityNotIn(List<Integer> values) {
            addCriterion("capital_nurse_pool_peopleid_identity not in", values, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityBetween(Integer value1, Integer value2) {
            addCriterion("capital_nurse_pool_peopleid_identity between", value1, value2, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolPeopleidIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_nurse_pool_peopleid_identity not between", value1, value2, "capitalNursePoolPeopleidIdentity");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyIsNull() {
            addCriterion("capital_nurse_pool_money is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyIsNotNull() {
            addCriterion("capital_nurse_pool_money is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyEqualTo(BigDecimal value) {
            addCriterion("capital_nurse_pool_money =", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyNotEqualTo(BigDecimal value) {
            addCriterion("capital_nurse_pool_money <>", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyGreaterThan(BigDecimal value) {
            addCriterion("capital_nurse_pool_money >", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_nurse_pool_money >=", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyLessThan(BigDecimal value) {
            addCriterion("capital_nurse_pool_money <", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_nurse_pool_money <=", value, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyIn(List<BigDecimal> values) {
            addCriterion("capital_nurse_pool_money in", values, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyNotIn(List<BigDecimal> values) {
            addCriterion("capital_nurse_pool_money not in", values, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_nurse_pool_money between", value1, value2, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_nurse_pool_money not between", value1, value2, "capitalNursePoolMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeIsNull() {
            addCriterion("capital_nurse_pool_type is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeIsNotNull() {
            addCriterion("capital_nurse_pool_type is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_type =", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeNotEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_type <>", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeGreaterThan(Integer value) {
            addCriterion("capital_nurse_pool_type >", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_type >=", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeLessThan(Integer value) {
            addCriterion("capital_nurse_pool_type <", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeLessThanOrEqualTo(Integer value) {
            addCriterion("capital_nurse_pool_type <=", value, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeIn(List<Integer> values) {
            addCriterion("capital_nurse_pool_type in", values, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeNotIn(List<Integer> values) {
            addCriterion("capital_nurse_pool_type not in", values, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeBetween(Integer value1, Integer value2) {
            addCriterion("capital_nurse_pool_type between", value1, value2, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_nurse_pool_type not between", value1, value2, "capitalNursePoolType");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakIsNull() {
            addCriterion("capital_nurse_pool_speak is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakIsNotNull() {
            addCriterion("capital_nurse_pool_speak is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakEqualTo(String value) {
            addCriterion("capital_nurse_pool_speak =", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakNotEqualTo(String value) {
            addCriterion("capital_nurse_pool_speak <>", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakGreaterThan(String value) {
            addCriterion("capital_nurse_pool_speak >", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_speak >=", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakLessThan(String value) {
            addCriterion("capital_nurse_pool_speak <", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakLessThanOrEqualTo(String value) {
            addCriterion("capital_nurse_pool_speak <=", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakLike(String value) {
            addCriterion("capital_nurse_pool_speak like", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakNotLike(String value) {
            addCriterion("capital_nurse_pool_speak not like", value, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakIn(List<String> values) {
            addCriterion("capital_nurse_pool_speak in", values, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakNotIn(List<String> values) {
            addCriterion("capital_nurse_pool_speak not in", values, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_speak between", value1, value2, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolSpeakNotBetween(String value1, String value2) {
            addCriterion("capital_nurse_pool_speak not between", value1, value2, "capitalNursePoolSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeIsNull() {
            addCriterion("capital_nurse_pool_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeIsNotNull() {
            addCriterion("capital_nurse_pool_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeEqualTo(Date value) {
            addCriterion("capital_nurse_pool_createtime =", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeNotEqualTo(Date value) {
            addCriterion("capital_nurse_pool_createtime <>", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeGreaterThan(Date value) {
            addCriterion("capital_nurse_pool_createtime >", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("capital_nurse_pool_createtime >=", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeLessThan(Date value) {
            addCriterion("capital_nurse_pool_createtime <", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("capital_nurse_pool_createtime <=", value, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeIn(List<Date> values) {
            addCriterion("capital_nurse_pool_createtime in", values, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeNotIn(List<Date> values) {
            addCriterion("capital_nurse_pool_createtime not in", values, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeBetween(Date value1, Date value2) {
            addCriterion("capital_nurse_pool_createtime between", value1, value2, "capitalNursePoolCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalNursePoolCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("capital_nurse_pool_createtime not between", value1, value2, "capitalNursePoolCreatetime");
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