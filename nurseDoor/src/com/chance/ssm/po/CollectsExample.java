package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectsExample() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(String value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(String value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(String value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(String value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(String value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLike(String value) {
            addCriterion("collection_id like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotLike(String value) {
            addCriterion("collection_id not like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<String> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<String> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(String value1, String value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(String value1, String value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridIsNull() {
            addCriterion("collection_userid is null");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridIsNotNull() {
            addCriterion("collection_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridEqualTo(String value) {
            addCriterion("collection_userid =", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridNotEqualTo(String value) {
            addCriterion("collection_userid <>", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridGreaterThan(String value) {
            addCriterion("collection_userid >", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridGreaterThanOrEqualTo(String value) {
            addCriterion("collection_userid >=", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridLessThan(String value) {
            addCriterion("collection_userid <", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridLessThanOrEqualTo(String value) {
            addCriterion("collection_userid <=", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridLike(String value) {
            addCriterion("collection_userid like", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridNotLike(String value) {
            addCriterion("collection_userid not like", value, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridIn(List<String> values) {
            addCriterion("collection_userid in", values, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridNotIn(List<String> values) {
            addCriterion("collection_userid not in", values, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridBetween(String value1, String value2) {
            addCriterion("collection_userid between", value1, value2, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionUseridNotBetween(String value1, String value2) {
            addCriterion("collection_userid not between", value1, value2, "collectionUserid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidIsNull() {
            addCriterion("collection_contentid is null");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidIsNotNull() {
            addCriterion("collection_contentid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidEqualTo(String value) {
            addCriterion("collection_contentid =", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidNotEqualTo(String value) {
            addCriterion("collection_contentid <>", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidGreaterThan(String value) {
            addCriterion("collection_contentid >", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidGreaterThanOrEqualTo(String value) {
            addCriterion("collection_contentid >=", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidLessThan(String value) {
            addCriterion("collection_contentid <", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidLessThanOrEqualTo(String value) {
            addCriterion("collection_contentid <=", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidLike(String value) {
            addCriterion("collection_contentid like", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidNotLike(String value) {
            addCriterion("collection_contentid not like", value, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidIn(List<String> values) {
            addCriterion("collection_contentid in", values, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidNotIn(List<String> values) {
            addCriterion("collection_contentid not in", values, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidBetween(String value1, String value2) {
            addCriterion("collection_contentid between", value1, value2, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionContentidNotBetween(String value1, String value2) {
            addCriterion("collection_contentid not between", value1, value2, "collectionContentid");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeIsNull() {
            addCriterion("collection_creatime is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeIsNotNull() {
            addCriterion("collection_creatime is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeEqualTo(Date value) {
            addCriterion("collection_creatime =", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeNotEqualTo(Date value) {
            addCriterion("collection_creatime <>", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeGreaterThan(Date value) {
            addCriterion("collection_creatime >", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_creatime >=", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeLessThan(Date value) {
            addCriterion("collection_creatime <", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_creatime <=", value, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeIn(List<Date> values) {
            addCriterion("collection_creatime in", values, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeNotIn(List<Date> values) {
            addCriterion("collection_creatime not in", values, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeBetween(Date value1, Date value2) {
            addCriterion("collection_creatime between", value1, value2, "collectionCreatime");
            return (Criteria) this;
        }

        public Criteria andCollectionCreatimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_creatime not between", value1, value2, "collectionCreatime");
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