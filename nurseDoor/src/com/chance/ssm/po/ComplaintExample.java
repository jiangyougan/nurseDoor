package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintExample() {
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

        public Criteria andComplaintIdIsNull() {
            addCriterion("complaint_id is null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdIsNotNull() {
            addCriterion("complaint_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdEqualTo(String value) {
            addCriterion("complaint_id =", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotEqualTo(String value) {
            addCriterion("complaint_id <>", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdGreaterThan(String value) {
            addCriterion("complaint_id >", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_id >=", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdLessThan(String value) {
            addCriterion("complaint_id <", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdLessThanOrEqualTo(String value) {
            addCriterion("complaint_id <=", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdLike(String value) {
            addCriterion("complaint_id like", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotLike(String value) {
            addCriterion("complaint_id not like", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdIn(List<String> values) {
            addCriterion("complaint_id in", values, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotIn(List<String> values) {
            addCriterion("complaint_id not in", values, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdBetween(String value1, String value2) {
            addCriterion("complaint_id between", value1, value2, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotBetween(String value1, String value2) {
            addCriterion("complaint_id not between", value1, value2, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberIsNull() {
            addCriterion("complaint_number is null");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberIsNotNull() {
            addCriterion("complaint_number is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberEqualTo(String value) {
            addCriterion("complaint_number =", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberNotEqualTo(String value) {
            addCriterion("complaint_number <>", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberGreaterThan(String value) {
            addCriterion("complaint_number >", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_number >=", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberLessThan(String value) {
            addCriterion("complaint_number <", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberLessThanOrEqualTo(String value) {
            addCriterion("complaint_number <=", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberLike(String value) {
            addCriterion("complaint_number like", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberNotLike(String value) {
            addCriterion("complaint_number not like", value, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberIn(List<String> values) {
            addCriterion("complaint_number in", values, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberNotIn(List<String> values) {
            addCriterion("complaint_number not in", values, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberBetween(String value1, String value2) {
            addCriterion("complaint_number between", value1, value2, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintNumberNotBetween(String value1, String value2) {
            addCriterion("complaint_number not between", value1, value2, "complaintNumber");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridIsNull() {
            addCriterion("complaint_userid is null");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridIsNotNull() {
            addCriterion("complaint_userid is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridEqualTo(String value) {
            addCriterion("complaint_userid =", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridNotEqualTo(String value) {
            addCriterion("complaint_userid <>", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridGreaterThan(String value) {
            addCriterion("complaint_userid >", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_userid >=", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridLessThan(String value) {
            addCriterion("complaint_userid <", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridLessThanOrEqualTo(String value) {
            addCriterion("complaint_userid <=", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridLike(String value) {
            addCriterion("complaint_userid like", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridNotLike(String value) {
            addCriterion("complaint_userid not like", value, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridIn(List<String> values) {
            addCriterion("complaint_userid in", values, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridNotIn(List<String> values) {
            addCriterion("complaint_userid not in", values, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridBetween(String value1, String value2) {
            addCriterion("complaint_userid between", value1, value2, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintUseridNotBetween(String value1, String value2) {
            addCriterion("complaint_userid not between", value1, value2, "complaintUserid");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityIsNull() {
            addCriterion("complaint_identity is null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityIsNotNull() {
            addCriterion("complaint_identity is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityEqualTo(Integer value) {
            addCriterion("complaint_identity =", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityNotEqualTo(Integer value) {
            addCriterion("complaint_identity <>", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityGreaterThan(Integer value) {
            addCriterion("complaint_identity >", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("complaint_identity >=", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityLessThan(Integer value) {
            addCriterion("complaint_identity <", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("complaint_identity <=", value, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityIn(List<Integer> values) {
            addCriterion("complaint_identity in", values, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityNotIn(List<Integer> values) {
            addCriterion("complaint_identity not in", values, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityBetween(Integer value1, Integer value2) {
            addCriterion("complaint_identity between", value1, value2, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("complaint_identity not between", value1, value2, "complaintIdentity");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNull() {
            addCriterion("complaint_content is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNotNull() {
            addCriterion("complaint_content is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentEqualTo(String value) {
            addCriterion("complaint_content =", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotEqualTo(String value) {
            addCriterion("complaint_content <>", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThan(String value) {
            addCriterion("complaint_content >", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content >=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThan(String value) {
            addCriterion("complaint_content <", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThanOrEqualTo(String value) {
            addCriterion("complaint_content <=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLike(String value) {
            addCriterion("complaint_content like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotLike(String value) {
            addCriterion("complaint_content not like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIn(List<String> values) {
            addCriterion("complaint_content in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotIn(List<String> values) {
            addCriterion("complaint_content not in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentBetween(String value1, String value2) {
            addCriterion("complaint_content between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotBetween(String value1, String value2) {
            addCriterion("complaint_content not between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteIsNull() {
            addCriterion("complaint_content_note is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteIsNotNull() {
            addCriterion("complaint_content_note is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteEqualTo(String value) {
            addCriterion("complaint_content_note =", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteNotEqualTo(String value) {
            addCriterion("complaint_content_note <>", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteGreaterThan(String value) {
            addCriterion("complaint_content_note >", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content_note >=", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteLessThan(String value) {
            addCriterion("complaint_content_note <", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteLessThanOrEqualTo(String value) {
            addCriterion("complaint_content_note <=", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteLike(String value) {
            addCriterion("complaint_content_note like", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteNotLike(String value) {
            addCriterion("complaint_content_note not like", value, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteIn(List<String> values) {
            addCriterion("complaint_content_note in", values, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteNotIn(List<String> values) {
            addCriterion("complaint_content_note not in", values, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteBetween(String value1, String value2) {
            addCriterion("complaint_content_note between", value1, value2, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNoteNotBetween(String value1, String value2) {
            addCriterion("complaint_content_note not between", value1, value2, "complaintContentNote");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakIsNull() {
            addCriterion("complaint_content_speak is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakIsNotNull() {
            addCriterion("complaint_content_speak is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakEqualTo(String value) {
            addCriterion("complaint_content_speak =", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakNotEqualTo(String value) {
            addCriterion("complaint_content_speak <>", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakGreaterThan(String value) {
            addCriterion("complaint_content_speak >", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content_speak >=", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakLessThan(String value) {
            addCriterion("complaint_content_speak <", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakLessThanOrEqualTo(String value) {
            addCriterion("complaint_content_speak <=", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakLike(String value) {
            addCriterion("complaint_content_speak like", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakNotLike(String value) {
            addCriterion("complaint_content_speak not like", value, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakIn(List<String> values) {
            addCriterion("complaint_content_speak in", values, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakNotIn(List<String> values) {
            addCriterion("complaint_content_speak not in", values, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakBetween(String value1, String value2) {
            addCriterion("complaint_content_speak between", value1, value2, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentSpeakNotBetween(String value1, String value2) {
            addCriterion("complaint_content_speak not between", value1, value2, "complaintContentSpeak");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicIsNull() {
            addCriterion("complaint_content_pic is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicIsNotNull() {
            addCriterion("complaint_content_pic is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicEqualTo(String value) {
            addCriterion("complaint_content_pic =", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicNotEqualTo(String value) {
            addCriterion("complaint_content_pic <>", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicGreaterThan(String value) {
            addCriterion("complaint_content_pic >", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content_pic >=", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicLessThan(String value) {
            addCriterion("complaint_content_pic <", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicLessThanOrEqualTo(String value) {
            addCriterion("complaint_content_pic <=", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicLike(String value) {
            addCriterion("complaint_content_pic like", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicNotLike(String value) {
            addCriterion("complaint_content_pic not like", value, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicIn(List<String> values) {
            addCriterion("complaint_content_pic in", values, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicNotIn(List<String> values) {
            addCriterion("complaint_content_pic not in", values, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicBetween(String value1, String value2) {
            addCriterion("complaint_content_pic between", value1, value2, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentPicNotBetween(String value1, String value2) {
            addCriterion("complaint_content_pic not between", value1, value2, "complaintContentPic");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverIsNull() {
            addCriterion("complaint_content_over is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverIsNotNull() {
            addCriterion("complaint_content_over is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverEqualTo(String value) {
            addCriterion("complaint_content_over =", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverNotEqualTo(String value) {
            addCriterion("complaint_content_over <>", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverGreaterThan(String value) {
            addCriterion("complaint_content_over >", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content_over >=", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverLessThan(String value) {
            addCriterion("complaint_content_over <", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverLessThanOrEqualTo(String value) {
            addCriterion("complaint_content_over <=", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverLike(String value) {
            addCriterion("complaint_content_over like", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverNotLike(String value) {
            addCriterion("complaint_content_over not like", value, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverIn(List<String> values) {
            addCriterion("complaint_content_over in", values, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverNotIn(List<String> values) {
            addCriterion("complaint_content_over not in", values, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverBetween(String value1, String value2) {
            addCriterion("complaint_content_over between", value1, value2, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOverNotBetween(String value1, String value2) {
            addCriterion("complaint_content_over not between", value1, value2, "complaintContentOver");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeIsNull() {
            addCriterion("complaint_handle_mode is null");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeIsNotNull() {
            addCriterion("complaint_handle_mode is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeEqualTo(Integer value) {
            addCriterion("complaint_handle_mode =", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeNotEqualTo(Integer value) {
            addCriterion("complaint_handle_mode <>", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeGreaterThan(Integer value) {
            addCriterion("complaint_handle_mode >", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complaint_handle_mode >=", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeLessThan(Integer value) {
            addCriterion("complaint_handle_mode <", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeLessThanOrEqualTo(Integer value) {
            addCriterion("complaint_handle_mode <=", value, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeIn(List<Integer> values) {
            addCriterion("complaint_handle_mode in", values, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeNotIn(List<Integer> values) {
            addCriterion("complaint_handle_mode not in", values, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeBetween(Integer value1, Integer value2) {
            addCriterion("complaint_handle_mode between", value1, value2, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintHandleModeNotBetween(Integer value1, Integer value2) {
            addCriterion("complaint_handle_mode not between", value1, value2, "complaintHandleMode");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowIsNull() {
            addCriterion("complaint_content_overtow is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowIsNotNull() {
            addCriterion("complaint_content_overtow is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowEqualTo(String value) {
            addCriterion("complaint_content_overtow =", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowNotEqualTo(String value) {
            addCriterion("complaint_content_overtow <>", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowGreaterThan(String value) {
            addCriterion("complaint_content_overtow >", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content_overtow >=", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowLessThan(String value) {
            addCriterion("complaint_content_overtow <", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowLessThanOrEqualTo(String value) {
            addCriterion("complaint_content_overtow <=", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowLike(String value) {
            addCriterion("complaint_content_overtow like", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowNotLike(String value) {
            addCriterion("complaint_content_overtow not like", value, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowIn(List<String> values) {
            addCriterion("complaint_content_overtow in", values, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowNotIn(List<String> values) {
            addCriterion("complaint_content_overtow not in", values, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowBetween(String value1, String value2) {
            addCriterion("complaint_content_overtow between", value1, value2, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintContentOvertowNotBetween(String value1, String value2) {
            addCriterion("complaint_content_overtow not between", value1, value2, "complaintContentOvertow");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneIsNull() {
            addCriterion("complaint_spareone is null");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneIsNotNull() {
            addCriterion("complaint_spareone is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneEqualTo(String value) {
            addCriterion("complaint_spareone =", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneNotEqualTo(String value) {
            addCriterion("complaint_spareone <>", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneGreaterThan(String value) {
            addCriterion("complaint_spareone >", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_spareone >=", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneLessThan(String value) {
            addCriterion("complaint_spareone <", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneLessThanOrEqualTo(String value) {
            addCriterion("complaint_spareone <=", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneLike(String value) {
            addCriterion("complaint_spareone like", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneNotLike(String value) {
            addCriterion("complaint_spareone not like", value, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneIn(List<String> values) {
            addCriterion("complaint_spareone in", values, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneNotIn(List<String> values) {
            addCriterion("complaint_spareone not in", values, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneBetween(String value1, String value2) {
            addCriterion("complaint_spareone between", value1, value2, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSpareoneNotBetween(String value1, String value2) {
            addCriterion("complaint_spareone not between", value1, value2, "complaintSpareone");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoIsNull() {
            addCriterion("complaint_sparetwo is null");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoIsNotNull() {
            addCriterion("complaint_sparetwo is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoEqualTo(String value) {
            addCriterion("complaint_sparetwo =", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoNotEqualTo(String value) {
            addCriterion("complaint_sparetwo <>", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoGreaterThan(String value) {
            addCriterion("complaint_sparetwo >", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_sparetwo >=", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoLessThan(String value) {
            addCriterion("complaint_sparetwo <", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoLessThanOrEqualTo(String value) {
            addCriterion("complaint_sparetwo <=", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoLike(String value) {
            addCriterion("complaint_sparetwo like", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoNotLike(String value) {
            addCriterion("complaint_sparetwo not like", value, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoIn(List<String> values) {
            addCriterion("complaint_sparetwo in", values, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoNotIn(List<String> values) {
            addCriterion("complaint_sparetwo not in", values, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoBetween(String value1, String value2) {
            addCriterion("complaint_sparetwo between", value1, value2, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintSparetwoNotBetween(String value1, String value2) {
            addCriterion("complaint_sparetwo not between", value1, value2, "complaintSparetwo");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeIsNull() {
            addCriterion("complaint_content_createtime is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeIsNotNull() {
            addCriterion("complaint_content_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeEqualTo(Date value) {
            addCriterion("complaint_content_createtime =", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeNotEqualTo(Date value) {
            addCriterion("complaint_content_createtime <>", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeGreaterThan(Date value) {
            addCriterion("complaint_content_createtime >", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complaint_content_createtime >=", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeLessThan(Date value) {
            addCriterion("complaint_content_createtime <", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("complaint_content_createtime <=", value, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeIn(List<Date> values) {
            addCriterion("complaint_content_createtime in", values, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeNotIn(List<Date> values) {
            addCriterion("complaint_content_createtime not in", values, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeBetween(Date value1, Date value2) {
            addCriterion("complaint_content_createtime between", value1, value2, "complaintContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andComplaintContentCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("complaint_content_createtime not between", value1, value2, "complaintContentCreatetime");
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