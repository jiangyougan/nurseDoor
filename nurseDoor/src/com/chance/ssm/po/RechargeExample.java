package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("recharge_id =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("recharge_id <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("recharge_id >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_id >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("recharge_id <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("recharge_id <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("recharge_id like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("recharge_id not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("recharge_id in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("recharge_id not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("recharge_id between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("recharge_id not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeUserIsNull() {
            addCriterion("recharge_user is null");
            return (Criteria) this;
        }

        public Criteria andRechargeUserIsNotNull() {
            addCriterion("recharge_user is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeUserEqualTo(String value) {
            addCriterion("recharge_user =", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserNotEqualTo(String value) {
            addCriterion("recharge_user <>", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserGreaterThan(String value) {
            addCriterion("recharge_user >", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_user >=", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserLessThan(String value) {
            addCriterion("recharge_user <", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserLessThanOrEqualTo(String value) {
            addCriterion("recharge_user <=", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserLike(String value) {
            addCriterion("recharge_user like", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserNotLike(String value) {
            addCriterion("recharge_user not like", value, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserIn(List<String> values) {
            addCriterion("recharge_user in", values, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserNotIn(List<String> values) {
            addCriterion("recharge_user not in", values, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserBetween(String value1, String value2) {
            addCriterion("recharge_user between", value1, value2, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeUserNotBetween(String value1, String value2) {
            addCriterion("recharge_user not between", value1, value2, "rechargeUser");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIsNull() {
            addCriterion("recharge_state is null");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIsNotNull() {
            addCriterion("recharge_state is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeStateEqualTo(Integer value) {
            addCriterion("recharge_state =", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotEqualTo(Integer value) {
            addCriterion("recharge_state <>", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateGreaterThan(Integer value) {
            addCriterion("recharge_state >", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_state >=", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateLessThan(Integer value) {
            addCriterion("recharge_state <", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_state <=", value, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateIn(List<Integer> values) {
            addCriterion("recharge_state in", values, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotIn(List<Integer> values) {
            addCriterion("recharge_state not in", values, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateBetween(Integer value1, Integer value2) {
            addCriterion("recharge_state between", value1, value2, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_state not between", value1, value2, "rechargeState");
            return (Criteria) this;
        }

        public Criteria andRechargeOverIsNull() {
            addCriterion("recharge_over is null");
            return (Criteria) this;
        }

        public Criteria andRechargeOverIsNotNull() {
            addCriterion("recharge_over is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeOverEqualTo(String value) {
            addCriterion("recharge_over =", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverNotEqualTo(String value) {
            addCriterion("recharge_over <>", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverGreaterThan(String value) {
            addCriterion("recharge_over >", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_over >=", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverLessThan(String value) {
            addCriterion("recharge_over <", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverLessThanOrEqualTo(String value) {
            addCriterion("recharge_over <=", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverLike(String value) {
            addCriterion("recharge_over like", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverNotLike(String value) {
            addCriterion("recharge_over not like", value, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverIn(List<String> values) {
            addCriterion("recharge_over in", values, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverNotIn(List<String> values) {
            addCriterion("recharge_over not in", values, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverBetween(String value1, String value2) {
            addCriterion("recharge_over between", value1, value2, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeOverNotBetween(String value1, String value2) {
            addCriterion("recharge_over not between", value1, value2, "rechargeOver");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
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