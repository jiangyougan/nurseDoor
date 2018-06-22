package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrafficExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrafficExample() {
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

        public Criteria andTrafficIdIsNull() {
            addCriterion("traffic_id is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIdIsNotNull() {
            addCriterion("traffic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficIdEqualTo(String value) {
            addCriterion("traffic_id =", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotEqualTo(String value) {
            addCriterion("traffic_id <>", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdGreaterThan(String value) {
            addCriterion("traffic_id >", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_id >=", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLessThan(String value) {
            addCriterion("traffic_id <", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLessThanOrEqualTo(String value) {
            addCriterion("traffic_id <=", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdLike(String value) {
            addCriterion("traffic_id like", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotLike(String value) {
            addCriterion("traffic_id not like", value, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdIn(List<String> values) {
            addCriterion("traffic_id in", values, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotIn(List<String> values) {
            addCriterion("traffic_id not in", values, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdBetween(String value1, String value2) {
            addCriterion("traffic_id between", value1, value2, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficIdNotBetween(String value1, String value2) {
            addCriterion("traffic_id not between", value1, value2, "trafficId");
            return (Criteria) this;
        }

        public Criteria andTrafficCostIsNull() {
            addCriterion("traffic_cost is null");
            return (Criteria) this;
        }

        public Criteria andTrafficCostIsNotNull() {
            addCriterion("traffic_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficCostEqualTo(BigDecimal value) {
            addCriterion("traffic_cost =", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostNotEqualTo(BigDecimal value) {
            addCriterion("traffic_cost <>", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostGreaterThan(BigDecimal value) {
            addCriterion("traffic_cost >", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_cost >=", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostLessThan(BigDecimal value) {
            addCriterion("traffic_cost <", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_cost <=", value, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostIn(List<BigDecimal> values) {
            addCriterion("traffic_cost in", values, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostNotIn(List<BigDecimal> values) {
            addCriterion("traffic_cost not in", values, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_cost between", value1, value2, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_cost not between", value1, value2, "trafficCost");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterIsNull() {
            addCriterion("traffic_creater is null");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterIsNotNull() {
            addCriterion("traffic_creater is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterEqualTo(String value) {
            addCriterion("traffic_creater =", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterNotEqualTo(String value) {
            addCriterion("traffic_creater <>", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterGreaterThan(String value) {
            addCriterion("traffic_creater >", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_creater >=", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterLessThan(String value) {
            addCriterion("traffic_creater <", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterLessThanOrEqualTo(String value) {
            addCriterion("traffic_creater <=", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterLike(String value) {
            addCriterion("traffic_creater like", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterNotLike(String value) {
            addCriterion("traffic_creater not like", value, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterIn(List<String> values) {
            addCriterion("traffic_creater in", values, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterNotIn(List<String> values) {
            addCriterion("traffic_creater not in", values, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterBetween(String value1, String value2) {
            addCriterion("traffic_creater between", value1, value2, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficCreaterNotBetween(String value1, String value2) {
            addCriterion("traffic_creater not between", value1, value2, "trafficCreater");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeIsNull() {
            addCriterion("traffic_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeIsNotNull() {
            addCriterion("traffic_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeEqualTo(Date value) {
            addCriterion("traffic_updatetime =", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeNotEqualTo(Date value) {
            addCriterion("traffic_updatetime <>", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeGreaterThan(Date value) {
            addCriterion("traffic_updatetime >", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("traffic_updatetime >=", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeLessThan(Date value) {
            addCriterion("traffic_updatetime <", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("traffic_updatetime <=", value, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeIn(List<Date> values) {
            addCriterion("traffic_updatetime in", values, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeNotIn(List<Date> values) {
            addCriterion("traffic_updatetime not in", values, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("traffic_updatetime between", value1, value2, "trafficUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTrafficUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("traffic_updatetime not between", value1, value2, "trafficUpdatetime");
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