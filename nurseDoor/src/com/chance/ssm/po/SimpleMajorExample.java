package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleMajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimpleMajorExample() {
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

        public Criteria andSimpleMajorIdIsNull() {
            addCriterion("simple_major_id is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdIsNotNull() {
            addCriterion("simple_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdEqualTo(String value) {
            addCriterion("simple_major_id =", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdNotEqualTo(String value) {
            addCriterion("simple_major_id <>", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdGreaterThan(String value) {
            addCriterion("simple_major_id >", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("simple_major_id >=", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdLessThan(String value) {
            addCriterion("simple_major_id <", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdLessThanOrEqualTo(String value) {
            addCriterion("simple_major_id <=", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdLike(String value) {
            addCriterion("simple_major_id like", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdNotLike(String value) {
            addCriterion("simple_major_id not like", value, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdIn(List<String> values) {
            addCriterion("simple_major_id in", values, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdNotIn(List<String> values) {
            addCriterion("simple_major_id not in", values, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdBetween(String value1, String value2) {
            addCriterion("simple_major_id between", value1, value2, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorIdNotBetween(String value1, String value2) {
            addCriterion("simple_major_id not between", value1, value2, "simpleMajorId");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameIsNull() {
            addCriterion("simple_major_name is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameIsNotNull() {
            addCriterion("simple_major_name is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameEqualTo(String value) {
            addCriterion("simple_major_name =", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameNotEqualTo(String value) {
            addCriterion("simple_major_name <>", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameGreaterThan(String value) {
            addCriterion("simple_major_name >", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("simple_major_name >=", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameLessThan(String value) {
            addCriterion("simple_major_name <", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameLessThanOrEqualTo(String value) {
            addCriterion("simple_major_name <=", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameLike(String value) {
            addCriterion("simple_major_name like", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameNotLike(String value) {
            addCriterion("simple_major_name not like", value, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameIn(List<String> values) {
            addCriterion("simple_major_name in", values, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameNotIn(List<String> values) {
            addCriterion("simple_major_name not in", values, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameBetween(String value1, String value2) {
            addCriterion("simple_major_name between", value1, value2, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNameNotBetween(String value1, String value2) {
            addCriterion("simple_major_name not between", value1, value2, "simpleMajorName");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteIsNull() {
            addCriterion("simple_major_note is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteIsNotNull() {
            addCriterion("simple_major_note is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteEqualTo(String value) {
            addCriterion("simple_major_note =", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteNotEqualTo(String value) {
            addCriterion("simple_major_note <>", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteGreaterThan(String value) {
            addCriterion("simple_major_note >", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteGreaterThanOrEqualTo(String value) {
            addCriterion("simple_major_note >=", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteLessThan(String value) {
            addCriterion("simple_major_note <", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteLessThanOrEqualTo(String value) {
            addCriterion("simple_major_note <=", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteLike(String value) {
            addCriterion("simple_major_note like", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteNotLike(String value) {
            addCriterion("simple_major_note not like", value, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteIn(List<String> values) {
            addCriterion("simple_major_note in", values, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteNotIn(List<String> values) {
            addCriterion("simple_major_note not in", values, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteBetween(String value1, String value2) {
            addCriterion("simple_major_note between", value1, value2, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorNoteNotBetween(String value1, String value2) {
            addCriterion("simple_major_note not between", value1, value2, "simpleMajorNote");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterIsNull() {
            addCriterion("simple_major_creater is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterIsNotNull() {
            addCriterion("simple_major_creater is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterEqualTo(String value) {
            addCriterion("simple_major_creater =", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterNotEqualTo(String value) {
            addCriterion("simple_major_creater <>", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterGreaterThan(String value) {
            addCriterion("simple_major_creater >", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("simple_major_creater >=", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterLessThan(String value) {
            addCriterion("simple_major_creater <", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterLessThanOrEqualTo(String value) {
            addCriterion("simple_major_creater <=", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterLike(String value) {
            addCriterion("simple_major_creater like", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterNotLike(String value) {
            addCriterion("simple_major_creater not like", value, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterIn(List<String> values) {
            addCriterion("simple_major_creater in", values, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterNotIn(List<String> values) {
            addCriterion("simple_major_creater not in", values, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterBetween(String value1, String value2) {
            addCriterion("simple_major_creater between", value1, value2, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreaterNotBetween(String value1, String value2) {
            addCriterion("simple_major_creater not between", value1, value2, "simpleMajorCreater");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeIsNull() {
            addCriterion("simple_major_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeIsNotNull() {
            addCriterion("simple_major_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeEqualTo(Date value) {
            addCriterion("simple_major_createtime =", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeNotEqualTo(Date value) {
            addCriterion("simple_major_createtime <>", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeGreaterThan(Date value) {
            addCriterion("simple_major_createtime >", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("simple_major_createtime >=", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeLessThan(Date value) {
            addCriterion("simple_major_createtime <", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("simple_major_createtime <=", value, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeIn(List<Date> values) {
            addCriterion("simple_major_createtime in", values, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeNotIn(List<Date> values) {
            addCriterion("simple_major_createtime not in", values, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeBetween(Date value1, Date value2) {
            addCriterion("simple_major_createtime between", value1, value2, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("simple_major_createtime not between", value1, value2, "simpleMajorCreatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeIsNull() {
            addCriterion("simple_major_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeIsNotNull() {
            addCriterion("simple_major_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeEqualTo(Date value) {
            addCriterion("simple_major_updatetime =", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeNotEqualTo(Date value) {
            addCriterion("simple_major_updatetime <>", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeGreaterThan(Date value) {
            addCriterion("simple_major_updatetime >", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("simple_major_updatetime >=", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeLessThan(Date value) {
            addCriterion("simple_major_updatetime <", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("simple_major_updatetime <=", value, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeIn(List<Date> values) {
            addCriterion("simple_major_updatetime in", values, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeNotIn(List<Date> values) {
            addCriterion("simple_major_updatetime not in", values, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("simple_major_updatetime between", value1, value2, "simpleMajorUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSimpleMajorUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("simple_major_updatetime not between", value1, value2, "simpleMajorUpdatetime");
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