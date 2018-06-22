package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProtectedAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProtectedAddressExample() {
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

        public Criteria andProtectedAddressIdIsNull() {
            addCriterion("protected_address_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdIsNotNull() {
            addCriterion("protected_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdEqualTo(String value) {
            addCriterion("protected_address_id =", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotEqualTo(String value) {
            addCriterion("protected_address_id <>", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdGreaterThan(String value) {
            addCriterion("protected_address_id >", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("protected_address_id >=", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLessThan(String value) {
            addCriterion("protected_address_id <", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLessThanOrEqualTo(String value) {
            addCriterion("protected_address_id <=", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLike(String value) {
            addCriterion("protected_address_id like", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotLike(String value) {
            addCriterion("protected_address_id not like", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdIn(List<String> values) {
            addCriterion("protected_address_id in", values, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotIn(List<String> values) {
            addCriterion("protected_address_id not in", values, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdBetween(String value1, String value2) {
            addCriterion("protected_address_id between", value1, value2, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotBetween(String value1, String value2) {
            addCriterion("protected_address_id not between", value1, value2, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridIsNull() {
            addCriterion("protected_address_userid is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridIsNotNull() {
            addCriterion("protected_address_userid is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridEqualTo(String value) {
            addCriterion("protected_address_userid =", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridNotEqualTo(String value) {
            addCriterion("protected_address_userid <>", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridGreaterThan(String value) {
            addCriterion("protected_address_userid >", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridGreaterThanOrEqualTo(String value) {
            addCriterion("protected_address_userid >=", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridLessThan(String value) {
            addCriterion("protected_address_userid <", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridLessThanOrEqualTo(String value) {
            addCriterion("protected_address_userid <=", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridLike(String value) {
            addCriterion("protected_address_userid like", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridNotLike(String value) {
            addCriterion("protected_address_userid not like", value, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridIn(List<String> values) {
            addCriterion("protected_address_userid in", values, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridNotIn(List<String> values) {
            addCriterion("protected_address_userid not in", values, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridBetween(String value1, String value2) {
            addCriterion("protected_address_userid between", value1, value2, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressUseridNotBetween(String value1, String value2) {
            addCriterion("protected_address_userid not between", value1, value2, "protectedAddressUserid");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXIsNull() {
            addCriterion("protected_address_position_x is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXIsNotNull() {
            addCriterion("protected_address_position_x is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXEqualTo(Double value) {
            addCriterion("protected_address_position_x =", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXNotEqualTo(Double value) {
            addCriterion("protected_address_position_x <>", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXGreaterThan(Double value) {
            addCriterion("protected_address_position_x >", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXGreaterThanOrEqualTo(Double value) {
            addCriterion("protected_address_position_x >=", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXLessThan(Double value) {
            addCriterion("protected_address_position_x <", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXLessThanOrEqualTo(Double value) {
            addCriterion("protected_address_position_x <=", value, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXIn(List<Double> values) {
            addCriterion("protected_address_position_x in", values, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXNotIn(List<Double> values) {
            addCriterion("protected_address_position_x not in", values, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXBetween(Double value1, Double value2) {
            addCriterion("protected_address_position_x between", value1, value2, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionXNotBetween(Double value1, Double value2) {
            addCriterion("protected_address_position_x not between", value1, value2, "protectedAddressPositionX");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYIsNull() {
            addCriterion("protected_address_position_y is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYIsNotNull() {
            addCriterion("protected_address_position_y is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYEqualTo(Double value) {
            addCriterion("protected_address_position_y =", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYNotEqualTo(Double value) {
            addCriterion("protected_address_position_y <>", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYGreaterThan(Double value) {
            addCriterion("protected_address_position_y >", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYGreaterThanOrEqualTo(Double value) {
            addCriterion("protected_address_position_y >=", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYLessThan(Double value) {
            addCriterion("protected_address_position_y <", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYLessThanOrEqualTo(Double value) {
            addCriterion("protected_address_position_y <=", value, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYIn(List<Double> values) {
            addCriterion("protected_address_position_y in", values, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYNotIn(List<Double> values) {
            addCriterion("protected_address_position_y not in", values, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYBetween(Double value1, Double value2) {
            addCriterion("protected_address_position_y between", value1, value2, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressPositionYNotBetween(Double value1, Double value2) {
            addCriterion("protected_address_position_y not between", value1, value2, "protectedAddressPositionY");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressIsNull() {
            addCriterion("protected_address_address is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressIsNotNull() {
            addCriterion("protected_address_address is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressEqualTo(String value) {
            addCriterion("protected_address_address =", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressNotEqualTo(String value) {
            addCriterion("protected_address_address <>", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressGreaterThan(String value) {
            addCriterion("protected_address_address >", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressGreaterThanOrEqualTo(String value) {
            addCriterion("protected_address_address >=", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressLessThan(String value) {
            addCriterion("protected_address_address <", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressLessThanOrEqualTo(String value) {
            addCriterion("protected_address_address <=", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressLike(String value) {
            addCriterion("protected_address_address like", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressNotLike(String value) {
            addCriterion("protected_address_address not like", value, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressIn(List<String> values) {
            addCriterion("protected_address_address in", values, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressNotIn(List<String> values) {
            addCriterion("protected_address_address not in", values, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressBetween(String value1, String value2) {
            addCriterion("protected_address_address between", value1, value2, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressAddressNotBetween(String value1, String value2) {
            addCriterion("protected_address_address not between", value1, value2, "protectedAddressAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeIsNull() {
            addCriterion("protected_address_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeIsNotNull() {
            addCriterion("protected_address_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeEqualTo(Date value) {
            addCriterion("protected_address_createtime =", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeNotEqualTo(Date value) {
            addCriterion("protected_address_createtime <>", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeGreaterThan(Date value) {
            addCriterion("protected_address_createtime >", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("protected_address_createtime >=", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeLessThan(Date value) {
            addCriterion("protected_address_createtime <", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("protected_address_createtime <=", value, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeIn(List<Date> values) {
            addCriterion("protected_address_createtime in", values, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeNotIn(List<Date> values) {
            addCriterion("protected_address_createtime not in", values, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeBetween(Date value1, Date value2) {
            addCriterion("protected_address_createtime between", value1, value2, "protectedAddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("protected_address_createtime not between", value1, value2, "protectedAddressCreatetime");
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