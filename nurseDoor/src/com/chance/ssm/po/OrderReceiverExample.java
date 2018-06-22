package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderReceiverExample {
    protected String orderByClause;

    protected boolean distinct;
    
    private Integer start;
    
    private Integer rows;

    protected List<Criteria> oredCriteria;
    
    

    public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public OrderReceiverExample() {
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

        public Criteria andOrderReceiveIdIsNull() {
            addCriterion("order_receive_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdIsNotNull() {
            addCriterion("order_receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdEqualTo(String value) {
            addCriterion("order_receive_id =", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdNotEqualTo(String value) {
            addCriterion("order_receive_id <>", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdGreaterThan(String value) {
            addCriterion("order_receive_id >", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_receive_id >=", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdLessThan(String value) {
            addCriterion("order_receive_id <", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdLessThanOrEqualTo(String value) {
            addCriterion("order_receive_id <=", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdLike(String value) {
            addCriterion("order_receive_id like", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdNotLike(String value) {
            addCriterion("order_receive_id not like", value, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdIn(List<String> values) {
            addCriterion("order_receive_id in", values, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdNotIn(List<String> values) {
            addCriterion("order_receive_id not in", values, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdBetween(String value1, String value2) {
            addCriterion("order_receive_id between", value1, value2, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderReceiveIdNotBetween(String value1, String value2) {
            addCriterion("order_receive_id not between", value1, value2, "orderReceiveId");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidIsNull() {
            addCriterion("order_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidIsNotNull() {
            addCriterion("order_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidEqualTo(String value) {
            addCriterion("order_nurseid =", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidNotEqualTo(String value) {
            addCriterion("order_nurseid <>", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidGreaterThan(String value) {
            addCriterion("order_nurseid >", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("order_nurseid >=", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidLessThan(String value) {
            addCriterion("order_nurseid <", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidLessThanOrEqualTo(String value) {
            addCriterion("order_nurseid <=", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidLike(String value) {
            addCriterion("order_nurseid like", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidNotLike(String value) {
            addCriterion("order_nurseid not like", value, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidIn(List<String> values) {
            addCriterion("order_nurseid in", values, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidNotIn(List<String> values) {
            addCriterion("order_nurseid not in", values, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidBetween(String value1, String value2) {
            addCriterion("order_nurseid between", value1, value2, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderNurseidNotBetween(String value1, String value2) {
            addCriterion("order_nurseid not between", value1, value2, "orderNurseid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidIsNull() {
            addCriterion("order_ordersendid is null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidIsNotNull() {
            addCriterion("order_ordersendid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidEqualTo(String value) {
            addCriterion("order_ordersendid =", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidNotEqualTo(String value) {
            addCriterion("order_ordersendid <>", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidGreaterThan(String value) {
            addCriterion("order_ordersendid >", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidGreaterThanOrEqualTo(String value) {
            addCriterion("order_ordersendid >=", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidLessThan(String value) {
            addCriterion("order_ordersendid <", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidLessThanOrEqualTo(String value) {
            addCriterion("order_ordersendid <=", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidLike(String value) {
            addCriterion("order_ordersendid like", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidNotLike(String value) {
            addCriterion("order_ordersendid not like", value, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidIn(List<String> values) {
            addCriterion("order_ordersendid in", values, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidNotIn(List<String> values) {
            addCriterion("order_ordersendid not in", values, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidBetween(String value1, String value2) {
            addCriterion("order_ordersendid between", value1, value2, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderOrdersendidNotBetween(String value1, String value2) {
            addCriterion("order_ordersendid not between", value1, value2, "orderOrdersendid");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateIsNull() {
            addCriterion("order_receivestate is null");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateIsNotNull() {
            addCriterion("order_receivestate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateEqualTo(String value) {
            addCriterion("order_receivestate =", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateNotEqualTo(String value) {
            addCriterion("order_receivestate <>", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateGreaterThan(String value) {
            addCriterion("order_receivestate >", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateGreaterThanOrEqualTo(String value) {
            addCriterion("order_receivestate >=", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateLessThan(String value) {
            addCriterion("order_receivestate <", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateLessThanOrEqualTo(String value) {
            addCriterion("order_receivestate <=", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateLike(String value) {
            addCriterion("order_receivestate like", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateNotLike(String value) {
            addCriterion("order_receivestate not like", value, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateIn(List<String> values) {
            addCriterion("order_receivestate in", values, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateNotIn(List<String> values) {
            addCriterion("order_receivestate not in", values, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateBetween(String value1, String value2) {
            addCriterion("order_receivestate between", value1, value2, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderReceivestateNotBetween(String value1, String value2) {
            addCriterion("order_receivestate not between", value1, value2, "orderReceivestate");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNull() {
            addCriterion("order_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNotNull() {
            addCriterion("order_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeEqualTo(Date value) {
            addCriterion("order_createtime =", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotEqualTo(Date value) {
            addCriterion("order_createtime <>", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThan(Date value) {
            addCriterion("order_createtime >", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_createtime >=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThan(Date value) {
            addCriterion("order_createtime <", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_createtime <=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIn(List<Date> values) {
            addCriterion("order_createtime in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotIn(List<Date> values) {
            addCriterion("order_createtime not in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeBetween(Date value1, Date value2) {
            addCriterion("order_createtime between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_createtime not between", value1, value2, "orderCreatetime");
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