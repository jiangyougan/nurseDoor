package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticsExample() {
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

        public Criteria andCountIdIsNull() {
            addCriterion("count_id is null");
            return (Criteria) this;
        }

        public Criteria andCountIdIsNotNull() {
            addCriterion("count_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountIdEqualTo(String value) {
            addCriterion("count_id =", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotEqualTo(String value) {
            addCriterion("count_id <>", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThan(String value) {
            addCriterion("count_id >", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThanOrEqualTo(String value) {
            addCriterion("count_id >=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThan(String value) {
            addCriterion("count_id <", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThanOrEqualTo(String value) {
            addCriterion("count_id <=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLike(String value) {
            addCriterion("count_id like", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotLike(String value) {
            addCriterion("count_id not like", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdIn(List<String> values) {
            addCriterion("count_id in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotIn(List<String> values) {
            addCriterion("count_id not in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdBetween(String value1, String value2) {
            addCriterion("count_id between", value1, value2, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotBetween(String value1, String value2) {
            addCriterion("count_id not between", value1, value2, "countId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdIsNull() {
            addCriterion("count_project_id is null");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdIsNotNull() {
            addCriterion("count_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdEqualTo(String value) {
            addCriterion("count_project_id =", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdNotEqualTo(String value) {
            addCriterion("count_project_id <>", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdGreaterThan(String value) {
            addCriterion("count_project_id >", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("count_project_id >=", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdLessThan(String value) {
            addCriterion("count_project_id <", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdLessThanOrEqualTo(String value) {
            addCriterion("count_project_id <=", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdLike(String value) {
            addCriterion("count_project_id like", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdNotLike(String value) {
            addCriterion("count_project_id not like", value, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdIn(List<String> values) {
            addCriterion("count_project_id in", values, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdNotIn(List<String> values) {
            addCriterion("count_project_id not in", values, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdBetween(String value1, String value2) {
            addCriterion("count_project_id between", value1, value2, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountProjectIdNotBetween(String value1, String value2) {
            addCriterion("count_project_id not between", value1, value2, "countProjectId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdIsNull() {
            addCriterion("count_content_id is null");
            return (Criteria) this;
        }

        public Criteria andCountContentIdIsNotNull() {
            addCriterion("count_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountContentIdEqualTo(String value) {
            addCriterion("count_content_id =", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdNotEqualTo(String value) {
            addCriterion("count_content_id <>", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdGreaterThan(String value) {
            addCriterion("count_content_id >", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("count_content_id >=", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdLessThan(String value) {
            addCriterion("count_content_id <", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdLessThanOrEqualTo(String value) {
            addCriterion("count_content_id <=", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdLike(String value) {
            addCriterion("count_content_id like", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdNotLike(String value) {
            addCriterion("count_content_id not like", value, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdIn(List<String> values) {
            addCriterion("count_content_id in", values, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdNotIn(List<String> values) {
            addCriterion("count_content_id not in", values, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdBetween(String value1, String value2) {
            addCriterion("count_content_id between", value1, value2, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountContentIdNotBetween(String value1, String value2) {
            addCriterion("count_content_id not between", value1, value2, "countContentId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdIsNull() {
            addCriterion("count_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdIsNotNull() {
            addCriterion("count_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdEqualTo(String value) {
            addCriterion("count_goods_id =", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdNotEqualTo(String value) {
            addCriterion("count_goods_id <>", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdGreaterThan(String value) {
            addCriterion("count_goods_id >", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("count_goods_id >=", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdLessThan(String value) {
            addCriterion("count_goods_id <", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("count_goods_id <=", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdLike(String value) {
            addCriterion("count_goods_id like", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdNotLike(String value) {
            addCriterion("count_goods_id not like", value, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdIn(List<String> values) {
            addCriterion("count_goods_id in", values, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdNotIn(List<String> values) {
            addCriterion("count_goods_id not in", values, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdBetween(String value1, String value2) {
            addCriterion("count_goods_id between", value1, value2, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountGoodsIdNotBetween(String value1, String value2) {
            addCriterion("count_goods_id not between", value1, value2, "countGoodsId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdIsNull() {
            addCriterion("count_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdIsNotNull() {
            addCriterion("count_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdEqualTo(String value) {
            addCriterion("count_nurse_id =", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdNotEqualTo(String value) {
            addCriterion("count_nurse_id <>", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdGreaterThan(String value) {
            addCriterion("count_nurse_id >", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("count_nurse_id >=", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdLessThan(String value) {
            addCriterion("count_nurse_id <", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdLessThanOrEqualTo(String value) {
            addCriterion("count_nurse_id <=", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdLike(String value) {
            addCriterion("count_nurse_id like", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdNotLike(String value) {
            addCriterion("count_nurse_id not like", value, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdIn(List<String> values) {
            addCriterion("count_nurse_id in", values, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdNotIn(List<String> values) {
            addCriterion("count_nurse_id not in", values, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdBetween(String value1, String value2) {
            addCriterion("count_nurse_id between", value1, value2, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andCountNurseIdNotBetween(String value1, String value2) {
            addCriterion("count_nurse_id not between", value1, value2, "countNurseId");
            return (Criteria) this;
        }

        public Criteria andContentNameIsNull() {
            addCriterion("content_name is null");
            return (Criteria) this;
        }

        public Criteria andContentNameIsNotNull() {
            addCriterion("content_name is not null");
            return (Criteria) this;
        }

        public Criteria andContentNameEqualTo(String value) {
            addCriterion("content_name =", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotEqualTo(String value) {
            addCriterion("content_name <>", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThan(String value) {
            addCriterion("content_name >", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThanOrEqualTo(String value) {
            addCriterion("content_name >=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThan(String value) {
            addCriterion("content_name <", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThanOrEqualTo(String value) {
            addCriterion("content_name <=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLike(String value) {
            addCriterion("content_name like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotLike(String value) {
            addCriterion("content_name not like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameIn(List<String> values) {
            addCriterion("content_name in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotIn(List<String> values) {
            addCriterion("content_name not in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameBetween(String value1, String value2) {
            addCriterion("content_name between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotBetween(String value1, String value2) {
            addCriterion("content_name not between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyIsNull() {
            addCriterion("count_redundancy is null");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyIsNotNull() {
            addCriterion("count_redundancy is not null");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyEqualTo(String value) {
            addCriterion("count_redundancy =", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyNotEqualTo(String value) {
            addCriterion("count_redundancy <>", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyGreaterThan(String value) {
            addCriterion("count_redundancy >", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyGreaterThanOrEqualTo(String value) {
            addCriterion("count_redundancy >=", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyLessThan(String value) {
            addCriterion("count_redundancy <", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyLessThanOrEqualTo(String value) {
            addCriterion("count_redundancy <=", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyLike(String value) {
            addCriterion("count_redundancy like", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyNotLike(String value) {
            addCriterion("count_redundancy not like", value, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyIn(List<String> values) {
            addCriterion("count_redundancy in", values, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyNotIn(List<String> values) {
            addCriterion("count_redundancy not in", values, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyBetween(String value1, String value2) {
            addCriterion("count_redundancy between", value1, value2, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyNotBetween(String value1, String value2) {
            addCriterion("count_redundancy not between", value1, value2, "countRedundancy");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyIsNull() {
            addCriterion("count_redundancy_any is null");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyIsNotNull() {
            addCriterion("count_redundancy_any is not null");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyEqualTo(String value) {
            addCriterion("count_redundancy_any =", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyNotEqualTo(String value) {
            addCriterion("count_redundancy_any <>", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyGreaterThan(String value) {
            addCriterion("count_redundancy_any >", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyGreaterThanOrEqualTo(String value) {
            addCriterion("count_redundancy_any >=", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyLessThan(String value) {
            addCriterion("count_redundancy_any <", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyLessThanOrEqualTo(String value) {
            addCriterion("count_redundancy_any <=", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyLike(String value) {
            addCriterion("count_redundancy_any like", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyNotLike(String value) {
            addCriterion("count_redundancy_any not like", value, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyIn(List<String> values) {
            addCriterion("count_redundancy_any in", values, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyNotIn(List<String> values) {
            addCriterion("count_redundancy_any not in", values, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyBetween(String value1, String value2) {
            addCriterion("count_redundancy_any between", value1, value2, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountRedundancyAnyNotBetween(String value1, String value2) {
            addCriterion("count_redundancy_any not between", value1, value2, "countRedundancyAny");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeIsNull() {
            addCriterion("count_nurse_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeIsNotNull() {
            addCriterion("count_nurse_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeEqualTo(Date value) {
            addCriterion("count_nurse_createtime =", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeNotEqualTo(Date value) {
            addCriterion("count_nurse_createtime <>", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeGreaterThan(Date value) {
            addCriterion("count_nurse_createtime >", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("count_nurse_createtime >=", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeLessThan(Date value) {
            addCriterion("count_nurse_createtime <", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("count_nurse_createtime <=", value, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeIn(List<Date> values) {
            addCriterion("count_nurse_createtime in", values, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeNotIn(List<Date> values) {
            addCriterion("count_nurse_createtime not in", values, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeBetween(Date value1, Date value2) {
            addCriterion("count_nurse_createtime between", value1, value2, "countNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountNurseCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("count_nurse_createtime not between", value1, value2, "countNurseCreatetime");
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