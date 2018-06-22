package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostNursefFocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostNursefFocusExample() {
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

        public Criteria andPostNursefFocusIdIsNull() {
            addCriterion("post_nursef_focus_id is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdIsNotNull() {
            addCriterion("post_nursef_focus_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdEqualTo(String value) {
            addCriterion("post_nursef_focus_id =", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdNotEqualTo(String value) {
            addCriterion("post_nursef_focus_id <>", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdGreaterThan(String value) {
            addCriterion("post_nursef_focus_id >", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_id >=", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdLessThan(String value) {
            addCriterion("post_nursef_focus_id <", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdLessThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_id <=", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdLike(String value) {
            addCriterion("post_nursef_focus_id like", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdNotLike(String value) {
            addCriterion("post_nursef_focus_id not like", value, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdIn(List<String> values) {
            addCriterion("post_nursef_focus_id in", values, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdNotIn(List<String> values) {
            addCriterion("post_nursef_focus_id not in", values, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_id between", value1, value2, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusIdNotBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_id not between", value1, value2, "postNursefFocusId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdIsNull() {
            addCriterion("post_nursef_focus_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdIsNotNull() {
            addCriterion("post_nursef_focus_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdEqualTo(String value) {
            addCriterion("post_nursef_focus_nurse_id =", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdNotEqualTo(String value) {
            addCriterion("post_nursef_focus_nurse_id <>", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdGreaterThan(String value) {
            addCriterion("post_nursef_focus_nurse_id >", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_nurse_id >=", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdLessThan(String value) {
            addCriterion("post_nursef_focus_nurse_id <", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdLessThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_nurse_id <=", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdLike(String value) {
            addCriterion("post_nursef_focus_nurse_id like", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdNotLike(String value) {
            addCriterion("post_nursef_focus_nurse_id not like", value, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdIn(List<String> values) {
            addCriterion("post_nursef_focus_nurse_id in", values, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdNotIn(List<String> values) {
            addCriterion("post_nursef_focus_nurse_id not in", values, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_nurse_id between", value1, value2, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNurseIdNotBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_nurse_id not between", value1, value2, "postNursefFocusNurseId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdIsNull() {
            addCriterion("post_nursef_post_two_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdIsNotNull() {
            addCriterion("post_nursef_post_two_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdEqualTo(String value) {
            addCriterion("post_nursef_post_two_level_id =", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdNotEqualTo(String value) {
            addCriterion("post_nursef_post_two_level_id <>", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdGreaterThan(String value) {
            addCriterion("post_nursef_post_two_level_id >", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_nursef_post_two_level_id >=", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdLessThan(String value) {
            addCriterion("post_nursef_post_two_level_id <", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdLessThanOrEqualTo(String value) {
            addCriterion("post_nursef_post_two_level_id <=", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdLike(String value) {
            addCriterion("post_nursef_post_two_level_id like", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdNotLike(String value) {
            addCriterion("post_nursef_post_two_level_id not like", value, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdIn(List<String> values) {
            addCriterion("post_nursef_post_two_level_id in", values, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdNotIn(List<String> values) {
            addCriterion("post_nursef_post_two_level_id not in", values, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdBetween(String value1, String value2) {
            addCriterion("post_nursef_post_two_level_id between", value1, value2, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefPostTwoLevelIdNotBetween(String value1, String value2) {
            addCriterion("post_nursef_post_two_level_id not between", value1, value2, "postNursefPostTwoLevelId");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteIsNull() {
            addCriterion("post_nursef_focus_note is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteIsNotNull() {
            addCriterion("post_nursef_focus_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteEqualTo(String value) {
            addCriterion("post_nursef_focus_note =", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteNotEqualTo(String value) {
            addCriterion("post_nursef_focus_note <>", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteGreaterThan(String value) {
            addCriterion("post_nursef_focus_note >", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_note >=", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteLessThan(String value) {
            addCriterion("post_nursef_focus_note <", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteLessThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_note <=", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteLike(String value) {
            addCriterion("post_nursef_focus_note like", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteNotLike(String value) {
            addCriterion("post_nursef_focus_note not like", value, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteIn(List<String> values) {
            addCriterion("post_nursef_focus_note in", values, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteNotIn(List<String> values) {
            addCriterion("post_nursef_focus_note not in", values, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_note between", value1, value2, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusNoteNotBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_note not between", value1, value2, "postNursefFocusNote");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakIsNull() {
            addCriterion("post_nursef_focus_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakIsNotNull() {
            addCriterion("post_nursef_focus_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakEqualTo(String value) {
            addCriterion("post_nursef_focus_speak =", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakNotEqualTo(String value) {
            addCriterion("post_nursef_focus_speak <>", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakGreaterThan(String value) {
            addCriterion("post_nursef_focus_speak >", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_speak >=", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakLessThan(String value) {
            addCriterion("post_nursef_focus_speak <", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakLessThanOrEqualTo(String value) {
            addCriterion("post_nursef_focus_speak <=", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakLike(String value) {
            addCriterion("post_nursef_focus_speak like", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakNotLike(String value) {
            addCriterion("post_nursef_focus_speak not like", value, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakIn(List<String> values) {
            addCriterion("post_nursef_focus_speak in", values, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakNotIn(List<String> values) {
            addCriterion("post_nursef_focus_speak not in", values, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_speak between", value1, value2, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusSpeakNotBetween(String value1, String value2) {
            addCriterion("post_nursef_focus_speak not between", value1, value2, "postNursefFocusSpeak");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeIsNull() {
            addCriterion("post_nursef_focus_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeIsNotNull() {
            addCriterion("post_nursef_focus_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeEqualTo(Date value) {
            addCriterion("post_nursef_focus_createtime =", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeNotEqualTo(Date value) {
            addCriterion("post_nursef_focus_createtime <>", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeGreaterThan(Date value) {
            addCriterion("post_nursef_focus_createtime >", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_nursef_focus_createtime >=", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeLessThan(Date value) {
            addCriterion("post_nursef_focus_createtime <", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_nursef_focus_createtime <=", value, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeIn(List<Date> values) {
            addCriterion("post_nursef_focus_createtime in", values, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeNotIn(List<Date> values) {
            addCriterion("post_nursef_focus_createtime not in", values, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_nursef_focus_createtime between", value1, value2, "postNursefFocusCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostNursefFocusCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_nursef_focus_createtime not between", value1, value2, "postNursefFocusCreatetime");
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