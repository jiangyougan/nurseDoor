package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostThreeLevelDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostThreeLevelDetailsExample() {
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

        public Criteria andPostThreeLevelDetailsIdIsNull() {
            addCriterion("post_three_level_details_id is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdIsNotNull() {
            addCriterion("post_three_level_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdEqualTo(String value) {
            addCriterion("post_three_level_details_id =", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdNotEqualTo(String value) {
            addCriterion("post_three_level_details_id <>", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdGreaterThan(String value) {
            addCriterion("post_three_level_details_id >", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_id >=", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdLessThan(String value) {
            addCriterion("post_three_level_details_id <", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_id <=", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdLike(String value) {
            addCriterion("post_three_level_details_id like", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdNotLike(String value) {
            addCriterion("post_three_level_details_id not like", value, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdIn(List<String> values) {
            addCriterion("post_three_level_details_id in", values, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdNotIn(List<String> values) {
            addCriterion("post_three_level_details_id not in", values, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdBetween(String value1, String value2) {
            addCriterion("post_three_level_details_id between", value1, value2, "postThreeLevelDetailsId");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsIdNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_id not between", value1, value2, "postThreeLevelDetailsId");
            return (Criteria) this;
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

        public Criteria andPostThreeLevelDetailsTitleIsNull() {
            addCriterion("post_three_level_details_title is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleIsNotNull() {
            addCriterion("post_three_level_details_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleEqualTo(String value) {
            addCriterion("post_three_level_details_title =", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleNotEqualTo(String value) {
            addCriterion("post_three_level_details_title <>", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleGreaterThan(String value) {
            addCriterion("post_three_level_details_title >", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_title >=", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleLessThan(String value) {
            addCriterion("post_three_level_details_title <", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_title <=", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleLike(String value) {
            addCriterion("post_three_level_details_title like", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleNotLike(String value) {
            addCriterion("post_three_level_details_title not like", value, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleIn(List<String> values) {
            addCriterion("post_three_level_details_title in", values, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleNotIn(List<String> values) {
            addCriterion("post_three_level_details_title not in", values, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleBetween(String value1, String value2) {
            addCriterion("post_three_level_details_title between", value1, value2, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsTitleNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_title not between", value1, value2, "postThreeLevelDetailsTitle");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberIsNull() {
            addCriterion("post_three_level_details_thing_number is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberIsNotNull() {
            addCriterion("post_three_level_details_thing_number is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberEqualTo(Integer value) {
            addCriterion("post_three_level_details_thing_number =", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberNotEqualTo(Integer value) {
            addCriterion("post_three_level_details_thing_number <>", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberGreaterThan(Integer value) {
            addCriterion("post_three_level_details_thing_number >", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_thing_number >=", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberLessThan(Integer value) {
            addCriterion("post_three_level_details_thing_number <", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_thing_number <=", value, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberIn(List<Integer> values) {
            addCriterion("post_three_level_details_thing_number in", values, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberNotIn(List<Integer> values) {
            addCriterion("post_three_level_details_thing_number not in", values, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_thing_number between", value1, value2, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsThingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_thing_number not between", value1, value2, "postThreeLevelDetailsThingNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberIsNull() {
            addCriterion("post_three_level_details_comment_number is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberIsNotNull() {
            addCriterion("post_three_level_details_comment_number is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberEqualTo(Integer value) {
            addCriterion("post_three_level_details_comment_number =", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberNotEqualTo(Integer value) {
            addCriterion("post_three_level_details_comment_number <>", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberGreaterThan(Integer value) {
            addCriterion("post_three_level_details_comment_number >", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_comment_number >=", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberLessThan(Integer value) {
            addCriterion("post_three_level_details_comment_number <", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_comment_number <=", value, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberIn(List<Integer> values) {
            addCriterion("post_three_level_details_comment_number in", values, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberNotIn(List<Integer> values) {
            addCriterion("post_three_level_details_comment_number not in", values, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_comment_number between", value1, value2, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCommentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_comment_number not between", value1, value2, "postThreeLevelDetailsCommentNumber");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankIsNull() {
            addCriterion("post_three_level_details_rank is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankIsNotNull() {
            addCriterion("post_three_level_details_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankEqualTo(Integer value) {
            addCriterion("post_three_level_details_rank =", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankNotEqualTo(Integer value) {
            addCriterion("post_three_level_details_rank <>", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankGreaterThan(Integer value) {
            addCriterion("post_three_level_details_rank >", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_rank >=", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankLessThan(Integer value) {
            addCriterion("post_three_level_details_rank <", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankLessThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_rank <=", value, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankIn(List<Integer> values) {
            addCriterion("post_three_level_details_rank in", values, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankNotIn(List<Integer> values) {
            addCriterion("post_three_level_details_rank not in", values, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_rank between", value1, value2, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsRankNotBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_rank not between", value1, value2, "postThreeLevelDetailsRank");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddIsNull() {
            addCriterion("post_three_level_details_add is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddIsNotNull() {
            addCriterion("post_three_level_details_add is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddEqualTo(Integer value) {
            addCriterion("post_three_level_details_add =", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddNotEqualTo(Integer value) {
            addCriterion("post_three_level_details_add <>", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddGreaterThan(Integer value) {
            addCriterion("post_three_level_details_add >", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_add >=", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddLessThan(Integer value) {
            addCriterion("post_three_level_details_add <", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddLessThanOrEqualTo(Integer value) {
            addCriterion("post_three_level_details_add <=", value, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddIn(List<Integer> values) {
            addCriterion("post_three_level_details_add in", values, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddNotIn(List<Integer> values) {
            addCriterion("post_three_level_details_add not in", values, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_add between", value1, value2, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsAddNotBetween(Integer value1, Integer value2) {
            addCriterion("post_three_level_details_add not between", value1, value2, "postThreeLevelDetailsAdd");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteIsNull() {
            addCriterion("post_three_level_details_note is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteIsNotNull() {
            addCriterion("post_three_level_details_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteEqualTo(String value) {
            addCriterion("post_three_level_details_note =", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteNotEqualTo(String value) {
            addCriterion("post_three_level_details_note <>", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteGreaterThan(String value) {
            addCriterion("post_three_level_details_note >", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_note >=", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteLessThan(String value) {
            addCriterion("post_three_level_details_note <", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_note <=", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteLike(String value) {
            addCriterion("post_three_level_details_note like", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteNotLike(String value) {
            addCriterion("post_three_level_details_note not like", value, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteIn(List<String> values) {
            addCriterion("post_three_level_details_note in", values, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteNotIn(List<String> values) {
            addCriterion("post_three_level_details_note not in", values, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteBetween(String value1, String value2) {
            addCriterion("post_three_level_details_note between", value1, value2, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsNoteNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_note not between", value1, value2, "postThreeLevelDetailsNote");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakIsNull() {
            addCriterion("post_three_level_details_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakIsNotNull() {
            addCriterion("post_three_level_details_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakEqualTo(String value) {
            addCriterion("post_three_level_details_speak =", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakNotEqualTo(String value) {
            addCriterion("post_three_level_details_speak <>", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakGreaterThan(String value) {
            addCriterion("post_three_level_details_speak >", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_speak >=", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakLessThan(String value) {
            addCriterion("post_three_level_details_speak <", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_speak <=", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakLike(String value) {
            addCriterion("post_three_level_details_speak like", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakNotLike(String value) {
            addCriterion("post_three_level_details_speak not like", value, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakIn(List<String> values) {
            addCriterion("post_three_level_details_speak in", values, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakNotIn(List<String> values) {
            addCriterion("post_three_level_details_speak not in", values, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakBetween(String value1, String value2) {
            addCriterion("post_three_level_details_speak between", value1, value2, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsSpeakNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_speak not between", value1, value2, "postThreeLevelDetailsSpeak");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkIsNull() {
            addCriterion("post_three_level_details_link is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkIsNotNull() {
            addCriterion("post_three_level_details_link is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkEqualTo(String value) {
            addCriterion("post_three_level_details_link =", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkNotEqualTo(String value) {
            addCriterion("post_three_level_details_link <>", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkGreaterThan(String value) {
            addCriterion("post_three_level_details_link >", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_link >=", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkLessThan(String value) {
            addCriterion("post_three_level_details_link <", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_link <=", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkLike(String value) {
            addCriterion("post_three_level_details_link like", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkNotLike(String value) {
            addCriterion("post_three_level_details_link not like", value, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkIn(List<String> values) {
            addCriterion("post_three_level_details_link in", values, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkNotIn(List<String> values) {
            addCriterion("post_three_level_details_link not in", values, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkBetween(String value1, String value2) {
            addCriterion("post_three_level_details_link between", value1, value2, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsLinkNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_link not between", value1, value2, "postThreeLevelDetailsLink");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterIsNull() {
            addCriterion("post_three_level_details_createter is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterIsNotNull() {
            addCriterion("post_three_level_details_createter is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterEqualTo(String value) {
            addCriterion("post_three_level_details_createter =", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterNotEqualTo(String value) {
            addCriterion("post_three_level_details_createter <>", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterGreaterThan(String value) {
            addCriterion("post_three_level_details_createter >", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_createter >=", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterLessThan(String value) {
            addCriterion("post_three_level_details_createter <", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterLessThanOrEqualTo(String value) {
            addCriterion("post_three_level_details_createter <=", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterLike(String value) {
            addCriterion("post_three_level_details_createter like", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterNotLike(String value) {
            addCriterion("post_three_level_details_createter not like", value, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterIn(List<String> values) {
            addCriterion("post_three_level_details_createter in", values, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterNotIn(List<String> values) {
            addCriterion("post_three_level_details_createter not in", values, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterBetween(String value1, String value2) {
            addCriterion("post_three_level_details_createter between", value1, value2, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreateterNotBetween(String value1, String value2) {
            addCriterion("post_three_level_details_createter not between", value1, value2, "postThreeLevelDetailsCreateter");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeIsNull() {
            addCriterion("post_three_level_details_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeIsNotNull() {
            addCriterion("post_three_level_details_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeEqualTo(Date value) {
            addCriterion("post_three_level_details_createtime =", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeNotEqualTo(Date value) {
            addCriterion("post_three_level_details_createtime <>", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeGreaterThan(Date value) {
            addCriterion("post_three_level_details_createtime >", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_three_level_details_createtime >=", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeLessThan(Date value) {
            addCriterion("post_three_level_details_createtime <", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_three_level_details_createtime <=", value, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeIn(List<Date> values) {
            addCriterion("post_three_level_details_createtime in", values, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeNotIn(List<Date> values) {
            addCriterion("post_three_level_details_createtime not in", values, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_three_level_details_createtime between", value1, value2, "postThreeLevelDetailsCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostThreeLevelDetailsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_three_level_details_createtime not between", value1, value2, "postThreeLevelDetailsCreatetime");
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