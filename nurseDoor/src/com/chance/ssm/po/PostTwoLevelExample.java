package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostTwoLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostTwoLevelExample() {
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

        public Criteria andPostTwoLevelIdIsNull() {
            addCriterion("post_two_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdIsNotNull() {
            addCriterion("post_two_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdEqualTo(String value) {
            addCriterion("post_two_level_id =", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdNotEqualTo(String value) {
            addCriterion("post_two_level_id <>", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdGreaterThan(String value) {
            addCriterion("post_two_level_id >", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_two_level_id >=", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdLessThan(String value) {
            addCriterion("post_two_level_id <", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdLessThanOrEqualTo(String value) {
            addCriterion("post_two_level_id <=", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdLike(String value) {
            addCriterion("post_two_level_id like", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdNotLike(String value) {
            addCriterion("post_two_level_id not like", value, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdIn(List<String> values) {
            addCriterion("post_two_level_id in", values, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdNotIn(List<String> values) {
            addCriterion("post_two_level_id not in", values, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdBetween(String value1, String value2) {
            addCriterion("post_two_level_id between", value1, value2, "postTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelIdNotBetween(String value1, String value2) {
            addCriterion("post_two_level_id not between", value1, value2, "postTwoLevelId");
            return (Criteria) this;
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

        public Criteria andPostTwoLevelNameIsNull() {
            addCriterion("post_two_level_name is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameIsNotNull() {
            addCriterion("post_two_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameEqualTo(String value) {
            addCriterion("post_two_level_name =", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameNotEqualTo(String value) {
            addCriterion("post_two_level_name <>", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameGreaterThan(String value) {
            addCriterion("post_two_level_name >", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_two_level_name >=", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameLessThan(String value) {
            addCriterion("post_two_level_name <", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameLessThanOrEqualTo(String value) {
            addCriterion("post_two_level_name <=", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameLike(String value) {
            addCriterion("post_two_level_name like", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameNotLike(String value) {
            addCriterion("post_two_level_name not like", value, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameIn(List<String> values) {
            addCriterion("post_two_level_name in", values, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameNotIn(List<String> values) {
            addCriterion("post_two_level_name not in", values, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameBetween(String value1, String value2) {
            addCriterion("post_two_level_name between", value1, value2, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNameNotBetween(String value1, String value2) {
            addCriterion("post_two_level_name not between", value1, value2, "postTwoLevelName");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteIsNull() {
            addCriterion("post_two_level_note is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteIsNotNull() {
            addCriterion("post_two_level_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteEqualTo(String value) {
            addCriterion("post_two_level_note =", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteNotEqualTo(String value) {
            addCriterion("post_two_level_note <>", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteGreaterThan(String value) {
            addCriterion("post_two_level_note >", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_two_level_note >=", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteLessThan(String value) {
            addCriterion("post_two_level_note <", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteLessThanOrEqualTo(String value) {
            addCriterion("post_two_level_note <=", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteLike(String value) {
            addCriterion("post_two_level_note like", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteNotLike(String value) {
            addCriterion("post_two_level_note not like", value, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteIn(List<String> values) {
            addCriterion("post_two_level_note in", values, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteNotIn(List<String> values) {
            addCriterion("post_two_level_note not in", values, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteBetween(String value1, String value2) {
            addCriterion("post_two_level_note between", value1, value2, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelNoteNotBetween(String value1, String value2) {
            addCriterion("post_two_level_note not between", value1, value2, "postTwoLevelNote");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakIsNull() {
            addCriterion("post_two_level_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakIsNotNull() {
            addCriterion("post_two_level_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakEqualTo(String value) {
            addCriterion("post_two_level_speak =", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakNotEqualTo(String value) {
            addCriterion("post_two_level_speak <>", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakGreaterThan(String value) {
            addCriterion("post_two_level_speak >", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_two_level_speak >=", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakLessThan(String value) {
            addCriterion("post_two_level_speak <", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakLessThanOrEqualTo(String value) {
            addCriterion("post_two_level_speak <=", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakLike(String value) {
            addCriterion("post_two_level_speak like", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakNotLike(String value) {
            addCriterion("post_two_level_speak not like", value, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakIn(List<String> values) {
            addCriterion("post_two_level_speak in", values, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakNotIn(List<String> values) {
            addCriterion("post_two_level_speak not in", values, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakBetween(String value1, String value2) {
            addCriterion("post_two_level_speak between", value1, value2, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelSpeakNotBetween(String value1, String value2) {
            addCriterion("post_two_level_speak not between", value1, value2, "postTwoLevelSpeak");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankIsNull() {
            addCriterion("post_two_level_rank is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankIsNotNull() {
            addCriterion("post_two_level_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankEqualTo(Integer value) {
            addCriterion("post_two_level_rank =", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankNotEqualTo(Integer value) {
            addCriterion("post_two_level_rank <>", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankGreaterThan(Integer value) {
            addCriterion("post_two_level_rank >", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_two_level_rank >=", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankLessThan(Integer value) {
            addCriterion("post_two_level_rank <", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankLessThanOrEqualTo(Integer value) {
            addCriterion("post_two_level_rank <=", value, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankIn(List<Integer> values) {
            addCriterion("post_two_level_rank in", values, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankNotIn(List<Integer> values) {
            addCriterion("post_two_level_rank not in", values, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankBetween(Integer value1, Integer value2) {
            addCriterion("post_two_level_rank between", value1, value2, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelRankNotBetween(Integer value1, Integer value2) {
            addCriterion("post_two_level_rank not between", value1, value2, "postTwoLevelRank");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterIsNull() {
            addCriterion("post_two_level_createter is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterIsNotNull() {
            addCriterion("post_two_level_createter is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterEqualTo(String value) {
            addCriterion("post_two_level_createter =", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterNotEqualTo(String value) {
            addCriterion("post_two_level_createter <>", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterGreaterThan(String value) {
            addCriterion("post_two_level_createter >", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("post_two_level_createter >=", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterLessThan(String value) {
            addCriterion("post_two_level_createter <", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterLessThanOrEqualTo(String value) {
            addCriterion("post_two_level_createter <=", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterLike(String value) {
            addCriterion("post_two_level_createter like", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterNotLike(String value) {
            addCriterion("post_two_level_createter not like", value, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterIn(List<String> values) {
            addCriterion("post_two_level_createter in", values, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterNotIn(List<String> values) {
            addCriterion("post_two_level_createter not in", values, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterBetween(String value1, String value2) {
            addCriterion("post_two_level_createter between", value1, value2, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreateterNotBetween(String value1, String value2) {
            addCriterion("post_two_level_createter not between", value1, value2, "postTwoLevelCreateter");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeIsNull() {
            addCriterion("post_two_level_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeIsNotNull() {
            addCriterion("post_two_level_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeEqualTo(Date value) {
            addCriterion("post_two_level_createtime =", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeNotEqualTo(Date value) {
            addCriterion("post_two_level_createtime <>", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeGreaterThan(Date value) {
            addCriterion("post_two_level_createtime >", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_two_level_createtime >=", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeLessThan(Date value) {
            addCriterion("post_two_level_createtime <", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_two_level_createtime <=", value, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeIn(List<Date> values) {
            addCriterion("post_two_level_createtime in", values, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeNotIn(List<Date> values) {
            addCriterion("post_two_level_createtime not in", values, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_two_level_createtime between", value1, value2, "postTwoLevelCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostTwoLevelCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_two_level_createtime not between", value1, value2, "postTwoLevelCreatetime");
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