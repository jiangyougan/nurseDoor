package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ByaddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ByaddressExample() {
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

        public Criteria andByaddressIdIsNull() {
            addCriterion("byaddress_id is null");
            return (Criteria) this;
        }

        public Criteria andByaddressIdIsNotNull() {
            addCriterion("byaddress_id is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressIdEqualTo(String value) {
            addCriterion("byaddress_id =", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdNotEqualTo(String value) {
            addCriterion("byaddress_id <>", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdGreaterThan(String value) {
            addCriterion("byaddress_id >", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("byaddress_id >=", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdLessThan(String value) {
            addCriterion("byaddress_id <", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdLessThanOrEqualTo(String value) {
            addCriterion("byaddress_id <=", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdLike(String value) {
            addCriterion("byaddress_id like", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdNotLike(String value) {
            addCriterion("byaddress_id not like", value, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdIn(List<String> values) {
            addCriterion("byaddress_id in", values, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdNotIn(List<String> values) {
            addCriterion("byaddress_id not in", values, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdBetween(String value1, String value2) {
            addCriterion("byaddress_id between", value1, value2, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressIdNotBetween(String value1, String value2) {
            addCriterion("byaddress_id not between", value1, value2, "byaddressId");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridIsNull() {
            addCriterion("byaddress_userid is null");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridIsNotNull() {
            addCriterion("byaddress_userid is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridEqualTo(String value) {
            addCriterion("byaddress_userid =", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridNotEqualTo(String value) {
            addCriterion("byaddress_userid <>", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridGreaterThan(String value) {
            addCriterion("byaddress_userid >", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridGreaterThanOrEqualTo(String value) {
            addCriterion("byaddress_userid >=", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridLessThan(String value) {
            addCriterion("byaddress_userid <", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridLessThanOrEqualTo(String value) {
            addCriterion("byaddress_userid <=", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridLike(String value) {
            addCriterion("byaddress_userid like", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridNotLike(String value) {
            addCriterion("byaddress_userid not like", value, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridIn(List<String> values) {
            addCriterion("byaddress_userid in", values, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridNotIn(List<String> values) {
            addCriterion("byaddress_userid not in", values, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridBetween(String value1, String value2) {
            addCriterion("byaddress_userid between", value1, value2, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressUseridNotBetween(String value1, String value2) {
            addCriterion("byaddress_userid not between", value1, value2, "byaddressUserid");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXIsNull() {
            addCriterion("byaddress_position_x is null");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXIsNotNull() {
            addCriterion("byaddress_position_x is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXEqualTo(Double value) {
            addCriterion("byaddress_position_x =", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXNotEqualTo(Double value) {
            addCriterion("byaddress_position_x <>", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXGreaterThan(Double value) {
            addCriterion("byaddress_position_x >", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXGreaterThanOrEqualTo(Double value) {
            addCriterion("byaddress_position_x >=", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXLessThan(Double value) {
            addCriterion("byaddress_position_x <", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXLessThanOrEqualTo(Double value) {
            addCriterion("byaddress_position_x <=", value, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXIn(List<Double> values) {
            addCriterion("byaddress_position_x in", values, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXNotIn(List<Double> values) {
            addCriterion("byaddress_position_x not in", values, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXBetween(Double value1, Double value2) {
            addCriterion("byaddress_position_x between", value1, value2, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionXNotBetween(Double value1, Double value2) {
            addCriterion("byaddress_position_x not between", value1, value2, "byaddressPositionX");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYIsNull() {
            addCriterion("byaddress_position_y is null");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYIsNotNull() {
            addCriterion("byaddress_position_y is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYEqualTo(Double value) {
            addCriterion("byaddress_position_y =", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYNotEqualTo(Double value) {
            addCriterion("byaddress_position_y <>", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYGreaterThan(Double value) {
            addCriterion("byaddress_position_y >", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYGreaterThanOrEqualTo(Double value) {
            addCriterion("byaddress_position_y >=", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYLessThan(Double value) {
            addCriterion("byaddress_position_y <", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYLessThanOrEqualTo(Double value) {
            addCriterion("byaddress_position_y <=", value, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYIn(List<Double> values) {
            addCriterion("byaddress_position_y in", values, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYNotIn(List<Double> values) {
            addCriterion("byaddress_position_y not in", values, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYBetween(Double value1, Double value2) {
            addCriterion("byaddress_position_y between", value1, value2, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressPositionYNotBetween(Double value1, Double value2) {
            addCriterion("byaddress_position_y not between", value1, value2, "byaddressPositionY");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressIsNull() {
            addCriterion("byaddress_address is null");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressIsNotNull() {
            addCriterion("byaddress_address is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressEqualTo(String value) {
            addCriterion("byaddress_address =", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressNotEqualTo(String value) {
            addCriterion("byaddress_address <>", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressGreaterThan(String value) {
            addCriterion("byaddress_address >", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressGreaterThanOrEqualTo(String value) {
            addCriterion("byaddress_address >=", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressLessThan(String value) {
            addCriterion("byaddress_address <", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressLessThanOrEqualTo(String value) {
            addCriterion("byaddress_address <=", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressLike(String value) {
            addCriterion("byaddress_address like", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressNotLike(String value) {
            addCriterion("byaddress_address not like", value, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressIn(List<String> values) {
            addCriterion("byaddress_address in", values, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressNotIn(List<String> values) {
            addCriterion("byaddress_address not in", values, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressBetween(String value1, String value2) {
            addCriterion("byaddress_address between", value1, value2, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressAddressNotBetween(String value1, String value2) {
            addCriterion("byaddress_address not between", value1, value2, "byaddressAddress");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeIsNull() {
            addCriterion("byaddress_createtime is null");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeIsNotNull() {
            addCriterion("byaddress_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeEqualTo(Date value) {
            addCriterion("byaddress_createtime =", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeNotEqualTo(Date value) {
            addCriterion("byaddress_createtime <>", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeGreaterThan(Date value) {
            addCriterion("byaddress_createtime >", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("byaddress_createtime >=", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeLessThan(Date value) {
            addCriterion("byaddress_createtime <", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("byaddress_createtime <=", value, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeIn(List<Date> values) {
            addCriterion("byaddress_createtime in", values, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeNotIn(List<Date> values) {
            addCriterion("byaddress_createtime not in", values, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeBetween(Date value1, Date value2) {
            addCriterion("byaddress_createtime between", value1, value2, "byaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andByaddressCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("byaddress_createtime not between", value1, value2, "byaddressCreatetime");
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