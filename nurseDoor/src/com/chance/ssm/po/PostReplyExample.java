package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostReplyExample() {
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

        public Criteria andPostReplyIdIsNull() {
            addCriterion("post_reply_id is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdIsNotNull() {
            addCriterion("post_reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdEqualTo(String value) {
            addCriterion("post_reply_id =", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdNotEqualTo(String value) {
            addCriterion("post_reply_id <>", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdGreaterThan(String value) {
            addCriterion("post_reply_id >", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_id >=", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdLessThan(String value) {
            addCriterion("post_reply_id <", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdLessThanOrEqualTo(String value) {
            addCriterion("post_reply_id <=", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdLike(String value) {
            addCriterion("post_reply_id like", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdNotLike(String value) {
            addCriterion("post_reply_id not like", value, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdIn(List<String> values) {
            addCriterion("post_reply_id in", values, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdNotIn(List<String> values) {
            addCriterion("post_reply_id not in", values, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdBetween(String value1, String value2) {
            addCriterion("post_reply_id between", value1, value2, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyIdNotBetween(String value1, String value2) {
            addCriterion("post_reply_id not between", value1, value2, "postReplyId");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleIsNull() {
            addCriterion("post_reply_reply_to_people is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleIsNotNull() {
            addCriterion("post_reply_reply_to_people is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleEqualTo(String value) {
            addCriterion("post_reply_reply_to_people =", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleNotEqualTo(String value) {
            addCriterion("post_reply_reply_to_people <>", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleGreaterThan(String value) {
            addCriterion("post_reply_reply_to_people >", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_reply_to_people >=", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleLessThan(String value) {
            addCriterion("post_reply_reply_to_people <", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleLessThanOrEqualTo(String value) {
            addCriterion("post_reply_reply_to_people <=", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleLike(String value) {
            addCriterion("post_reply_reply_to_people like", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleNotLike(String value) {
            addCriterion("post_reply_reply_to_people not like", value, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleIn(List<String> values) {
            addCriterion("post_reply_reply_to_people in", values, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleNotIn(List<String> values) {
            addCriterion("post_reply_reply_to_people not in", values, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleBetween(String value1, String value2) {
            addCriterion("post_reply_reply_to_people between", value1, value2, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyReplyToPeopleNotBetween(String value1, String value2) {
            addCriterion("post_reply_reply_to_people not between", value1, value2, "postReplyReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleIsNull() {
            addCriterion("post_reply_be_reply_to_people is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleIsNotNull() {
            addCriterion("post_reply_be_reply_to_people is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleEqualTo(String value) {
            addCriterion("post_reply_be_reply_to_people =", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleNotEqualTo(String value) {
            addCriterion("post_reply_be_reply_to_people <>", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleGreaterThan(String value) {
            addCriterion("post_reply_be_reply_to_people >", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_be_reply_to_people >=", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleLessThan(String value) {
            addCriterion("post_reply_be_reply_to_people <", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleLessThanOrEqualTo(String value) {
            addCriterion("post_reply_be_reply_to_people <=", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleLike(String value) {
            addCriterion("post_reply_be_reply_to_people like", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleNotLike(String value) {
            addCriterion("post_reply_be_reply_to_people not like", value, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleIn(List<String> values) {
            addCriterion("post_reply_be_reply_to_people in", values, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleNotIn(List<String> values) {
            addCriterion("post_reply_be_reply_to_people not in", values, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleBetween(String value1, String value2) {
            addCriterion("post_reply_be_reply_to_people between", value1, value2, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyBeReplyToPeopleNotBetween(String value1, String value2) {
            addCriterion("post_reply_be_reply_to_people not between", value1, value2, "postReplyBeReplyToPeople");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdIsNull() {
            addCriterion("post_reply_post_three_id is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdIsNotNull() {
            addCriterion("post_reply_post_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdEqualTo(String value) {
            addCriterion("post_reply_post_three_id =", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdNotEqualTo(String value) {
            addCriterion("post_reply_post_three_id <>", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdGreaterThan(String value) {
            addCriterion("post_reply_post_three_id >", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_post_three_id >=", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdLessThan(String value) {
            addCriterion("post_reply_post_three_id <", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdLessThanOrEqualTo(String value) {
            addCriterion("post_reply_post_three_id <=", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdLike(String value) {
            addCriterion("post_reply_post_three_id like", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdNotLike(String value) {
            addCriterion("post_reply_post_three_id not like", value, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdIn(List<String> values) {
            addCriterion("post_reply_post_three_id in", values, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdNotIn(List<String> values) {
            addCriterion("post_reply_post_three_id not in", values, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdBetween(String value1, String value2) {
            addCriterion("post_reply_post_three_id between", value1, value2, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyPostThreeIdNotBetween(String value1, String value2) {
            addCriterion("post_reply_post_three_id not between", value1, value2, "postReplyPostThreeId");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentIsNull() {
            addCriterion("post_reply_content is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentIsNotNull() {
            addCriterion("post_reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentEqualTo(String value) {
            addCriterion("post_reply_content =", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentNotEqualTo(String value) {
            addCriterion("post_reply_content <>", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentGreaterThan(String value) {
            addCriterion("post_reply_content >", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_content >=", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentLessThan(String value) {
            addCriterion("post_reply_content <", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentLessThanOrEqualTo(String value) {
            addCriterion("post_reply_content <=", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentLike(String value) {
            addCriterion("post_reply_content like", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentNotLike(String value) {
            addCriterion("post_reply_content not like", value, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentIn(List<String> values) {
            addCriterion("post_reply_content in", values, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentNotIn(List<String> values) {
            addCriterion("post_reply_content not in", values, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentBetween(String value1, String value2) {
            addCriterion("post_reply_content between", value1, value2, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyContentNotBetween(String value1, String value2) {
            addCriterion("post_reply_content not between", value1, value2, "postReplyContent");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteIsNull() {
            addCriterion("post_reply_note is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteIsNotNull() {
            addCriterion("post_reply_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteEqualTo(String value) {
            addCriterion("post_reply_note =", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteNotEqualTo(String value) {
            addCriterion("post_reply_note <>", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteGreaterThan(String value) {
            addCriterion("post_reply_note >", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_note >=", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteLessThan(String value) {
            addCriterion("post_reply_note <", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteLessThanOrEqualTo(String value) {
            addCriterion("post_reply_note <=", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteLike(String value) {
            addCriterion("post_reply_note like", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteNotLike(String value) {
            addCriterion("post_reply_note not like", value, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteIn(List<String> values) {
            addCriterion("post_reply_note in", values, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteNotIn(List<String> values) {
            addCriterion("post_reply_note not in", values, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteBetween(String value1, String value2) {
            addCriterion("post_reply_note between", value1, value2, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplyNoteNotBetween(String value1, String value2) {
            addCriterion("post_reply_note not between", value1, value2, "postReplyNote");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakIsNull() {
            addCriterion("post_reply_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakIsNotNull() {
            addCriterion("post_reply_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakEqualTo(String value) {
            addCriterion("post_reply_speak =", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakNotEqualTo(String value) {
            addCriterion("post_reply_speak <>", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakGreaterThan(String value) {
            addCriterion("post_reply_speak >", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_reply_speak >=", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakLessThan(String value) {
            addCriterion("post_reply_speak <", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakLessThanOrEqualTo(String value) {
            addCriterion("post_reply_speak <=", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakLike(String value) {
            addCriterion("post_reply_speak like", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakNotLike(String value) {
            addCriterion("post_reply_speak not like", value, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakIn(List<String> values) {
            addCriterion("post_reply_speak in", values, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakNotIn(List<String> values) {
            addCriterion("post_reply_speak not in", values, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakBetween(String value1, String value2) {
            addCriterion("post_reply_speak between", value1, value2, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplySpeakNotBetween(String value1, String value2) {
            addCriterion("post_reply_speak not between", value1, value2, "postReplySpeak");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeIsNull() {
            addCriterion("post_reply_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeIsNotNull() {
            addCriterion("post_reply_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeEqualTo(Date value) {
            addCriterion("post_reply_createtime =", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeNotEqualTo(Date value) {
            addCriterion("post_reply_createtime <>", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeGreaterThan(Date value) {
            addCriterion("post_reply_createtime >", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_reply_createtime >=", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeLessThan(Date value) {
            addCriterion("post_reply_createtime <", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_reply_createtime <=", value, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeIn(List<Date> values) {
            addCriterion("post_reply_createtime in", values, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeNotIn(List<Date> values) {
            addCriterion("post_reply_createtime not in", values, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_reply_createtime between", value1, value2, "postReplyCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostReplyCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_reply_createtime not between", value1, value2, "postReplyCreatetime");
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