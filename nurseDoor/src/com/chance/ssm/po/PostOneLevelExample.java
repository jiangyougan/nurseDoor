package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostOneLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostOneLevelExample() {
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

        public Criteria andPostOneLevelIdIsNull() {
            addCriterion("post_one_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdIsNotNull() {
            addCriterion("post_one_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdEqualTo(String value) {
            addCriterion("post_one_level_id =", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdNotEqualTo(String value) {
            addCriterion("post_one_level_id <>", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdGreaterThan(String value) {
            addCriterion("post_one_level_id >", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_one_level_id >=", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdLessThan(String value) {
            addCriterion("post_one_level_id <", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdLessThanOrEqualTo(String value) {
            addCriterion("post_one_level_id <=", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdLike(String value) {
            addCriterion("post_one_level_id like", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdNotLike(String value) {
            addCriterion("post_one_level_id not like", value, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdIn(List<String> values) {
            addCriterion("post_one_level_id in", values, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdNotIn(List<String> values) {
            addCriterion("post_one_level_id not in", values, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdBetween(String value1, String value2) {
            addCriterion("post_one_level_id between", value1, value2, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelIdNotBetween(String value1, String value2) {
            addCriterion("post_one_level_id not between", value1, value2, "postOneLevelId");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameIsNull() {
            addCriterion("post_one_level_name is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameIsNotNull() {
            addCriterion("post_one_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameEqualTo(String value) {
            addCriterion("post_one_level_name =", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameNotEqualTo(String value) {
            addCriterion("post_one_level_name <>", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameGreaterThan(String value) {
            addCriterion("post_one_level_name >", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_one_level_name >=", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameLessThan(String value) {
            addCriterion("post_one_level_name <", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameLessThanOrEqualTo(String value) {
            addCriterion("post_one_level_name <=", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameLike(String value) {
            addCriterion("post_one_level_name like", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameNotLike(String value) {
            addCriterion("post_one_level_name not like", value, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameIn(List<String> values) {
            addCriterion("post_one_level_name in", values, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameNotIn(List<String> values) {
            addCriterion("post_one_level_name not in", values, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameBetween(String value1, String value2) {
            addCriterion("post_one_level_name between", value1, value2, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNameNotBetween(String value1, String value2) {
            addCriterion("post_one_level_name not between", value1, value2, "postOneLevelName");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteIsNull() {
            addCriterion("post_one_level_note is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteIsNotNull() {
            addCriterion("post_one_level_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteEqualTo(String value) {
            addCriterion("post_one_level_note =", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteNotEqualTo(String value) {
            addCriterion("post_one_level_note <>", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteGreaterThan(String value) {
            addCriterion("post_one_level_note >", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_one_level_note >=", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteLessThan(String value) {
            addCriterion("post_one_level_note <", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteLessThanOrEqualTo(String value) {
            addCriterion("post_one_level_note <=", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteLike(String value) {
            addCriterion("post_one_level_note like", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteNotLike(String value) {
            addCriterion("post_one_level_note not like", value, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteIn(List<String> values) {
            addCriterion("post_one_level_note in", values, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteNotIn(List<String> values) {
            addCriterion("post_one_level_note not in", values, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteBetween(String value1, String value2) {
            addCriterion("post_one_level_note between", value1, value2, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelNoteNotBetween(String value1, String value2) {
            addCriterion("post_one_level_note not between", value1, value2, "postOneLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakIsNull() {
            addCriterion("post_one_level_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakIsNotNull() {
            addCriterion("post_one_level_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakEqualTo(String value) {
            addCriterion("post_one_level_speak =", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakNotEqualTo(String value) {
            addCriterion("post_one_level_speak <>", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakGreaterThan(String value) {
            addCriterion("post_one_level_speak >", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_one_level_speak >=", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakLessThan(String value) {
            addCriterion("post_one_level_speak <", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakLessThanOrEqualTo(String value) {
            addCriterion("post_one_level_speak <=", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakLike(String value) {
            addCriterion("post_one_level_speak like", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakNotLike(String value) {
            addCriterion("post_one_level_speak not like", value, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakIn(List<String> values) {
            addCriterion("post_one_level_speak in", values, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakNotIn(List<String> values) {
            addCriterion("post_one_level_speak not in", values, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakBetween(String value1, String value2) {
            addCriterion("post_one_level_speak between", value1, value2, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelSpeakNotBetween(String value1, String value2) {
            addCriterion("post_one_level_speak not between", value1, value2, "postOneLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankIsNull() {
            addCriterion("post_one_level_rank is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankIsNotNull() {
            addCriterion("post_one_level_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankEqualTo(Integer value) {
            addCriterion("post_one_level_rank =", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankNotEqualTo(Integer value) {
            addCriterion("post_one_level_rank <>", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankGreaterThan(Integer value) {
            addCriterion("post_one_level_rank >", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_one_level_rank >=", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankLessThan(Integer value) {
            addCriterion("post_one_level_rank <", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankLessThanOrEqualTo(Integer value) {
            addCriterion("post_one_level_rank <=", value, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankIn(List<Integer> values) {
            addCriterion("post_one_level_rank in", values, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankNotIn(List<Integer> values) {
            addCriterion("post_one_level_rank not in", values, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankBetween(Integer value1, Integer value2) {
            addCriterion("post_one_level_rank between", value1, value2, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelRankNotBetween(Integer value1, Integer value2) {
            addCriterion("post_one_level_rank not between", value1, value2, "postOneLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterIsNull() {
            addCriterion("post_one_level_createter is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterIsNotNull() {
            addCriterion("post_one_level_createter is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterEqualTo(String value) {
            addCriterion("post_one_level_createter =", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterNotEqualTo(String value) {
            addCriterion("post_one_level_createter <>", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterGreaterThan(String value) {
            addCriterion("post_one_level_createter >", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("post_one_level_createter >=", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterLessThan(String value) {
            addCriterion("post_one_level_createter <", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterLessThanOrEqualTo(String value) {
            addCriterion("post_one_level_createter <=", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterLike(String value) {
            addCriterion("post_one_level_createter like", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterNotLike(String value) {
            addCriterion("post_one_level_createter not like", value, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterIn(List<String> values) {
            addCriterion("post_one_level_createter in", values, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterNotIn(List<String> values) {
            addCriterion("post_one_level_createter not in", values, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterBetween(String value1, String value2) {
            addCriterion("post_one_level_createter between", value1, value2, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreateterNotBetween(String value1, String value2) {
            addCriterion("post_one_level_createter not between", value1, value2, "postOneLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeIsNull() {
            addCriterion("post_one_level_createtetime is null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeIsNotNull() {
            addCriterion("post_one_level_createtetime is not null");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeEqualTo(Date value) {
            addCriterion("post_one_level_createtetime =", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeNotEqualTo(Date value) {
            addCriterion("post_one_level_createtetime <>", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeGreaterThan(Date value) {
            addCriterion("post_one_level_createtetime >", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_one_level_createtetime >=", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeLessThan(Date value) {
            addCriterion("post_one_level_createtetime <", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_one_level_createtetime <=", value, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeIn(List<Date> values) {
            addCriterion("post_one_level_createtetime in", values, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeNotIn(List<Date> values) {
            addCriterion("post_one_level_createtetime not in", values, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeBetween(Date value1, Date value2) {
            addCriterion("post_one_level_createtetime between", value1, value2, "postOneLevelCreatetetime");
            return (Criteria) this;
        }

        public Criteria andPostOneLevelCreatetetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_one_level_createtetime not between", value1, value2, "postOneLevelCreatetetime");
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