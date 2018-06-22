package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("note_id like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("note_id not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteNameIsNull() {
            addCriterion("note_name is null");
            return (Criteria) this;
        }

        public Criteria andNoteNameIsNotNull() {
            addCriterion("note_name is not null");
            return (Criteria) this;
        }

        public Criteria andNoteNameEqualTo(String value) {
            addCriterion("note_name =", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotEqualTo(String value) {
            addCriterion("note_name <>", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameGreaterThan(String value) {
            addCriterion("note_name >", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameGreaterThanOrEqualTo(String value) {
            addCriterion("note_name >=", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLessThan(String value) {
            addCriterion("note_name <", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLessThanOrEqualTo(String value) {
            addCriterion("note_name <=", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameLike(String value) {
            addCriterion("note_name like", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotLike(String value) {
            addCriterion("note_name not like", value, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameIn(List<String> values) {
            addCriterion("note_name in", values, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotIn(List<String> values) {
            addCriterion("note_name not in", values, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameBetween(String value1, String value2) {
            addCriterion("note_name between", value1, value2, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteNameNotBetween(String value1, String value2) {
            addCriterion("note_name not between", value1, value2, "noteName");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeIsNull() {
            addCriterion("note_crtetime is null");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeIsNotNull() {
            addCriterion("note_crtetime is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeEqualTo(Date value) {
            addCriterion("note_crtetime =", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeNotEqualTo(Date value) {
            addCriterion("note_crtetime <>", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeGreaterThan(Date value) {
            addCriterion("note_crtetime >", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("note_crtetime >=", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeLessThan(Date value) {
            addCriterion("note_crtetime <", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeLessThanOrEqualTo(Date value) {
            addCriterion("note_crtetime <=", value, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeIn(List<Date> values) {
            addCriterion("note_crtetime in", values, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeNotIn(List<Date> values) {
            addCriterion("note_crtetime not in", values, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeBetween(Date value1, Date value2) {
            addCriterion("note_crtetime between", value1, value2, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrtetimeNotBetween(Date value1, Date value2) {
            addCriterion("note_crtetime not between", value1, value2, "noteCrtetime");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminIsNull() {
            addCriterion("note_crteadmin is null");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminIsNotNull() {
            addCriterion("note_crteadmin is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminEqualTo(String value) {
            addCriterion("note_crteadmin =", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminNotEqualTo(String value) {
            addCriterion("note_crteadmin <>", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminGreaterThan(String value) {
            addCriterion("note_crteadmin >", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminGreaterThanOrEqualTo(String value) {
            addCriterion("note_crteadmin >=", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminLessThan(String value) {
            addCriterion("note_crteadmin <", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminLessThanOrEqualTo(String value) {
            addCriterion("note_crteadmin <=", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminLike(String value) {
            addCriterion("note_crteadmin like", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminNotLike(String value) {
            addCriterion("note_crteadmin not like", value, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminIn(List<String> values) {
            addCriterion("note_crteadmin in", values, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminNotIn(List<String> values) {
            addCriterion("note_crteadmin not in", values, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminBetween(String value1, String value2) {
            addCriterion("note_crteadmin between", value1, value2, "noteCrteadmin");
            return (Criteria) this;
        }

        public Criteria andNoteCrteadminNotBetween(String value1, String value2) {
            addCriterion("note_crteadmin not between", value1, value2, "noteCrteadmin");
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