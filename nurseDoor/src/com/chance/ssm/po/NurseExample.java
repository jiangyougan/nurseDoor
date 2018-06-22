package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseExample() {
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

        public Criteria andNurseIdIsNull() {
            addCriterion("nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseIdIsNotNull() {
            addCriterion("nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseIdEqualTo(String value) {
            addCriterion("nurse_id =", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotEqualTo(String value) {
            addCriterion("nurse_id <>", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThan(String value) {
            addCriterion("nurse_id >", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_id >=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThan(String value) {
            addCriterion("nurse_id <", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_id <=", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdLike(String value) {
            addCriterion("nurse_id like", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotLike(String value) {
            addCriterion("nurse_id not like", value, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdIn(List<String> values) {
            addCriterion("nurse_id in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotIn(List<String> values) {
            addCriterion("nurse_id not in", values, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdBetween(String value1, String value2) {
            addCriterion("nurse_id between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseIdNotBetween(String value1, String value2) {
            addCriterion("nurse_id not between", value1, value2, "nurseId");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderIsNull() {
            addCriterion("nurse_header is null");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderIsNotNull() {
            addCriterion("nurse_header is not null");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderEqualTo(String value) {
            addCriterion("nurse_header =", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderNotEqualTo(String value) {
            addCriterion("nurse_header <>", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderGreaterThan(String value) {
            addCriterion("nurse_header >", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_header >=", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderLessThan(String value) {
            addCriterion("nurse_header <", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderLessThanOrEqualTo(String value) {
            addCriterion("nurse_header <=", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderLike(String value) {
            addCriterion("nurse_header like", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderNotLike(String value) {
            addCriterion("nurse_header not like", value, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderIn(List<String> values) {
            addCriterion("nurse_header in", values, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderNotIn(List<String> values) {
            addCriterion("nurse_header not in", values, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderBetween(String value1, String value2) {
            addCriterion("nurse_header between", value1, value2, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseHeaderNotBetween(String value1, String value2) {
            addCriterion("nurse_header not between", value1, value2, "nurseHeader");
            return (Criteria) this;
        }

        public Criteria andNurseNickIsNull() {
            addCriterion("nurse_nick is null");
            return (Criteria) this;
        }

        public Criteria andNurseNickIsNotNull() {
            addCriterion("nurse_nick is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNickEqualTo(String value) {
            addCriterion("nurse_nick =", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickNotEqualTo(String value) {
            addCriterion("nurse_nick <>", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickGreaterThan(String value) {
            addCriterion("nurse_nick >", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nick >=", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickLessThan(String value) {
            addCriterion("nurse_nick <", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickLessThanOrEqualTo(String value) {
            addCriterion("nurse_nick <=", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickLike(String value) {
            addCriterion("nurse_nick like", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickNotLike(String value) {
            addCriterion("nurse_nick not like", value, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickIn(List<String> values) {
            addCriterion("nurse_nick in", values, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickNotIn(List<String> values) {
            addCriterion("nurse_nick not in", values, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickBetween(String value1, String value2) {
            addCriterion("nurse_nick between", value1, value2, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNickNotBetween(String value1, String value2) {
            addCriterion("nurse_nick not between", value1, value2, "nurseNick");
            return (Criteria) this;
        }

        public Criteria andNurseNameIsNull() {
            addCriterion("nurse_name is null");
            return (Criteria) this;
        }

        public Criteria andNurseNameIsNotNull() {
            addCriterion("nurse_name is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNameEqualTo(String value) {
            addCriterion("nurse_name =", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotEqualTo(String value) {
            addCriterion("nurse_name <>", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameGreaterThan(String value) {
            addCriterion("nurse_name >", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_name >=", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLessThan(String value) {
            addCriterion("nurse_name <", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLessThanOrEqualTo(String value) {
            addCriterion("nurse_name <=", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameLike(String value) {
            addCriterion("nurse_name like", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotLike(String value) {
            addCriterion("nurse_name not like", value, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameIn(List<String> values) {
            addCriterion("nurse_name in", values, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotIn(List<String> values) {
            addCriterion("nurse_name not in", values, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameBetween(String value1, String value2) {
            addCriterion("nurse_name between", value1, value2, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNurseNameNotBetween(String value1, String value2) {
            addCriterion("nurse_name not between", value1, value2, "nurseName");
            return (Criteria) this;
        }

        public Criteria andNursePwdIsNull() {
            addCriterion("nurse_pwd is null");
            return (Criteria) this;
        }

        public Criteria andNursePwdIsNotNull() {
            addCriterion("nurse_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andNursePwdEqualTo(String value) {
            addCriterion("nurse_pwd =", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdNotEqualTo(String value) {
            addCriterion("nurse_pwd <>", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdGreaterThan(String value) {
            addCriterion("nurse_pwd >", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_pwd >=", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdLessThan(String value) {
            addCriterion("nurse_pwd <", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdLessThanOrEqualTo(String value) {
            addCriterion("nurse_pwd <=", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdLike(String value) {
            addCriterion("nurse_pwd like", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdNotLike(String value) {
            addCriterion("nurse_pwd not like", value, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdIn(List<String> values) {
            addCriterion("nurse_pwd in", values, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdNotIn(List<String> values) {
            addCriterion("nurse_pwd not in", values, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdBetween(String value1, String value2) {
            addCriterion("nurse_pwd between", value1, value2, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePwdNotBetween(String value1, String value2) {
            addCriterion("nurse_pwd not between", value1, value2, "nursePwd");
            return (Criteria) this;
        }

        public Criteria andNursePhoneIsNull() {
            addCriterion("nurse_phone is null");
            return (Criteria) this;
        }

        public Criteria andNursePhoneIsNotNull() {
            addCriterion("nurse_phone is not null");
            return (Criteria) this;
        }

        public Criteria andNursePhoneEqualTo(String value) {
            addCriterion("nurse_phone =", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneNotEqualTo(String value) {
            addCriterion("nurse_phone <>", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneGreaterThan(String value) {
            addCriterion("nurse_phone >", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_phone >=", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneLessThan(String value) {
            addCriterion("nurse_phone <", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneLessThanOrEqualTo(String value) {
            addCriterion("nurse_phone <=", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneLike(String value) {
            addCriterion("nurse_phone like", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneNotLike(String value) {
            addCriterion("nurse_phone not like", value, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneIn(List<String> values) {
            addCriterion("nurse_phone in", values, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneNotIn(List<String> values) {
            addCriterion("nurse_phone not in", values, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneBetween(String value1, String value2) {
            addCriterion("nurse_phone between", value1, value2, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNursePhoneNotBetween(String value1, String value2) {
            addCriterion("nurse_phone not between", value1, value2, "nursePhone");
            return (Criteria) this;
        }

        public Criteria andNurseAddressIsNull() {
            addCriterion("nurse_address is null");
            return (Criteria) this;
        }

        public Criteria andNurseAddressIsNotNull() {
            addCriterion("nurse_address is not null");
            return (Criteria) this;
        }

        public Criteria andNurseAddressEqualTo(String value) {
            addCriterion("nurse_address =", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressNotEqualTo(String value) {
            addCriterion("nurse_address <>", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressGreaterThan(String value) {
            addCriterion("nurse_address >", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_address >=", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressLessThan(String value) {
            addCriterion("nurse_address <", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressLessThanOrEqualTo(String value) {
            addCriterion("nurse_address <=", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressLike(String value) {
            addCriterion("nurse_address like", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressNotLike(String value) {
            addCriterion("nurse_address not like", value, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressIn(List<String> values) {
            addCriterion("nurse_address in", values, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressNotIn(List<String> values) {
            addCriterion("nurse_address not in", values, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressBetween(String value1, String value2) {
            addCriterion("nurse_address between", value1, value2, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseAddressNotBetween(String value1, String value2) {
            addCriterion("nurse_address not between", value1, value2, "nurseAddress");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeIsNull() {
            addCriterion("nurse_invitationcode is null");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeIsNotNull() {
            addCriterion("nurse_invitationcode is not null");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeEqualTo(String value) {
            addCriterion("nurse_invitationcode =", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeNotEqualTo(String value) {
            addCriterion("nurse_invitationcode <>", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeGreaterThan(String value) {
            addCriterion("nurse_invitationcode >", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_invitationcode >=", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeLessThan(String value) {
            addCriterion("nurse_invitationcode <", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeLessThanOrEqualTo(String value) {
            addCriterion("nurse_invitationcode <=", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeLike(String value) {
            addCriterion("nurse_invitationcode like", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeNotLike(String value) {
            addCriterion("nurse_invitationcode not like", value, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeIn(List<String> values) {
            addCriterion("nurse_invitationcode in", values, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeNotIn(List<String> values) {
            addCriterion("nurse_invitationcode not in", values, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeBetween(String value1, String value2) {
            addCriterion("nurse_invitationcode between", value1, value2, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationcodeNotBetween(String value1, String value2) {
            addCriterion("nurse_invitationcode not between", value1, value2, "nurseInvitationcode");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkIsNull() {
            addCriterion("nurse_invitationlink is null");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkIsNotNull() {
            addCriterion("nurse_invitationlink is not null");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkEqualTo(String value) {
            addCriterion("nurse_invitationlink =", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkNotEqualTo(String value) {
            addCriterion("nurse_invitationlink <>", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkGreaterThan(String value) {
            addCriterion("nurse_invitationlink >", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_invitationlink >=", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkLessThan(String value) {
            addCriterion("nurse_invitationlink <", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkLessThanOrEqualTo(String value) {
            addCriterion("nurse_invitationlink <=", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkLike(String value) {
            addCriterion("nurse_invitationlink like", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkNotLike(String value) {
            addCriterion("nurse_invitationlink not like", value, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkIn(List<String> values) {
            addCriterion("nurse_invitationlink in", values, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkNotIn(List<String> values) {
            addCriterion("nurse_invitationlink not in", values, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkBetween(String value1, String value2) {
            addCriterion("nurse_invitationlink between", value1, value2, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseInvitationlinkNotBetween(String value1, String value2) {
            addCriterion("nurse_invitationlink not between", value1, value2, "nurseInvitationlink");
            return (Criteria) this;
        }

        public Criteria andNurseSexIsNull() {
            addCriterion("nurse_sex is null");
            return (Criteria) this;
        }

        public Criteria andNurseSexIsNotNull() {
            addCriterion("nurse_sex is not null");
            return (Criteria) this;
        }

        public Criteria andNurseSexEqualTo(String value) {
            addCriterion("nurse_sex =", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexNotEqualTo(String value) {
            addCriterion("nurse_sex <>", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexGreaterThan(String value) {
            addCriterion("nurse_sex >", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_sex >=", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexLessThan(String value) {
            addCriterion("nurse_sex <", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexLessThanOrEqualTo(String value) {
            addCriterion("nurse_sex <=", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexLike(String value) {
            addCriterion("nurse_sex like", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexNotLike(String value) {
            addCriterion("nurse_sex not like", value, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexIn(List<String> values) {
            addCriterion("nurse_sex in", values, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexNotIn(List<String> values) {
            addCriterion("nurse_sex not in", values, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexBetween(String value1, String value2) {
            addCriterion("nurse_sex between", value1, value2, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseSexNotBetween(String value1, String value2) {
            addCriterion("nurse_sex not between", value1, value2, "nurseSex");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIsNull() {
            addCriterion("nurse_age is null");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIsNotNull() {
            addCriterion("nurse_age is not null");
            return (Criteria) this;
        }

        public Criteria andNurseAgeEqualTo(String value) {
            addCriterion("nurse_age =", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotEqualTo(String value) {
            addCriterion("nurse_age <>", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeGreaterThan(String value) {
            addCriterion("nurse_age >", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_age >=", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeLessThan(String value) {
            addCriterion("nurse_age <", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeLessThanOrEqualTo(String value) {
            addCriterion("nurse_age <=", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeLike(String value) {
            addCriterion("nurse_age like", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotLike(String value) {
            addCriterion("nurse_age not like", value, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeIn(List<String> values) {
            addCriterion("nurse_age in", values, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotIn(List<String> values) {
            addCriterion("nurse_age not in", values, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeBetween(String value1, String value2) {
            addCriterion("nurse_age between", value1, value2, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseAgeNotBetween(String value1, String value2) {
            addCriterion("nurse_age not between", value1, value2, "nurseAge");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIsNull() {
            addCriterion("nurse_language is null");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIsNotNull() {
            addCriterion("nurse_language is not null");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageEqualTo(String value) {
            addCriterion("nurse_language =", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotEqualTo(String value) {
            addCriterion("nurse_language <>", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageGreaterThan(String value) {
            addCriterion("nurse_language >", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_language >=", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLessThan(String value) {
            addCriterion("nurse_language <", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLessThanOrEqualTo(String value) {
            addCriterion("nurse_language <=", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageLike(String value) {
            addCriterion("nurse_language like", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotLike(String value) {
            addCriterion("nurse_language not like", value, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageIn(List<String> values) {
            addCriterion("nurse_language in", values, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotIn(List<String> values) {
            addCriterion("nurse_language not in", values, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageBetween(String value1, String value2) {
            addCriterion("nurse_language between", value1, value2, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseLanguageNotBetween(String value1, String value2) {
            addCriterion("nurse_language not between", value1, value2, "nurseLanguage");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitIsNull() {
            addCriterion("nurse_work_unit is null");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitIsNotNull() {
            addCriterion("nurse_work_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitEqualTo(String value) {
            addCriterion("nurse_work_unit =", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitNotEqualTo(String value) {
            addCriterion("nurse_work_unit <>", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitGreaterThan(String value) {
            addCriterion("nurse_work_unit >", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_work_unit >=", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitLessThan(String value) {
            addCriterion("nurse_work_unit <", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitLessThanOrEqualTo(String value) {
            addCriterion("nurse_work_unit <=", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitLike(String value) {
            addCriterion("nurse_work_unit like", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitNotLike(String value) {
            addCriterion("nurse_work_unit not like", value, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitIn(List<String> values) {
            addCriterion("nurse_work_unit in", values, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitNotIn(List<String> values) {
            addCriterion("nurse_work_unit not in", values, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitBetween(String value1, String value2) {
            addCriterion("nurse_work_unit between", value1, value2, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseWorkUnitNotBetween(String value1, String value2) {
            addCriterion("nurse_work_unit not between", value1, value2, "nurseWorkUnit");
            return (Criteria) this;
        }

        public Criteria andNurseJobIsNull() {
            addCriterion("nurse_job is null");
            return (Criteria) this;
        }

        public Criteria andNurseJobIsNotNull() {
            addCriterion("nurse_job is not null");
            return (Criteria) this;
        }

        public Criteria andNurseJobEqualTo(String value) {
            addCriterion("nurse_job =", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobNotEqualTo(String value) {
            addCriterion("nurse_job <>", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobGreaterThan(String value) {
            addCriterion("nurse_job >", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_job >=", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobLessThan(String value) {
            addCriterion("nurse_job <", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobLessThanOrEqualTo(String value) {
            addCriterion("nurse_job <=", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobLike(String value) {
            addCriterion("nurse_job like", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobNotLike(String value) {
            addCriterion("nurse_job not like", value, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobIn(List<String> values) {
            addCriterion("nurse_job in", values, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobNotIn(List<String> values) {
            addCriterion("nurse_job not in", values, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobBetween(String value1, String value2) {
            addCriterion("nurse_job between", value1, value2, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseJobNotBetween(String value1, String value2) {
            addCriterion("nurse_job not between", value1, value2, "nurseJob");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeIsNull() {
            addCriterion("nurse_office is null");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeIsNotNull() {
            addCriterion("nurse_office is not null");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeEqualTo(String value) {
            addCriterion("nurse_office =", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeNotEqualTo(String value) {
            addCriterion("nurse_office <>", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeGreaterThan(String value) {
            addCriterion("nurse_office >", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_office >=", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeLessThan(String value) {
            addCriterion("nurse_office <", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeLessThanOrEqualTo(String value) {
            addCriterion("nurse_office <=", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeLike(String value) {
            addCriterion("nurse_office like", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeNotLike(String value) {
            addCriterion("nurse_office not like", value, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeIn(List<String> values) {
            addCriterion("nurse_office in", values, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeNotIn(List<String> values) {
            addCriterion("nurse_office not in", values, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeBetween(String value1, String value2) {
            addCriterion("nurse_office between", value1, value2, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseOfficeNotBetween(String value1, String value2) {
            addCriterion("nurse_office not between", value1, value2, "nurseOffice");
            return (Criteria) this;
        }

        public Criteria andNurseNumberIsNull() {
            addCriterion("nurse_number is null");
            return (Criteria) this;
        }

        public Criteria andNurseNumberIsNotNull() {
            addCriterion("nurse_number is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNumberEqualTo(String value) {
            addCriterion("nurse_number =", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberNotEqualTo(String value) {
            addCriterion("nurse_number <>", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberGreaterThan(String value) {
            addCriterion("nurse_number >", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_number >=", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberLessThan(String value) {
            addCriterion("nurse_number <", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberLessThanOrEqualTo(String value) {
            addCriterion("nurse_number <=", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberLike(String value) {
            addCriterion("nurse_number like", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberNotLike(String value) {
            addCriterion("nurse_number not like", value, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberIn(List<String> values) {
            addCriterion("nurse_number in", values, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberNotIn(List<String> values) {
            addCriterion("nurse_number not in", values, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberBetween(String value1, String value2) {
            addCriterion("nurse_number between", value1, value2, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseNumberNotBetween(String value1, String value2) {
            addCriterion("nurse_number not between", value1, value2, "nurseNumber");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceIsNull() {
            addCriterion("nurse_yearsofservice is null");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceIsNotNull() {
            addCriterion("nurse_yearsofservice is not null");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceEqualTo(String value) {
            addCriterion("nurse_yearsofservice =", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceNotEqualTo(String value) {
            addCriterion("nurse_yearsofservice <>", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceGreaterThan(String value) {
            addCriterion("nurse_yearsofservice >", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_yearsofservice >=", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceLessThan(String value) {
            addCriterion("nurse_yearsofservice <", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceLessThanOrEqualTo(String value) {
            addCriterion("nurse_yearsofservice <=", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceLike(String value) {
            addCriterion("nurse_yearsofservice like", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceNotLike(String value) {
            addCriterion("nurse_yearsofservice not like", value, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceIn(List<String> values) {
            addCriterion("nurse_yearsofservice in", values, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceNotIn(List<String> values) {
            addCriterion("nurse_yearsofservice not in", values, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceBetween(String value1, String value2) {
            addCriterion("nurse_yearsofservice between", value1, value2, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseYearsofserviceNotBetween(String value1, String value2) {
            addCriterion("nurse_yearsofservice not between", value1, value2, "nurseYearsofservice");
            return (Criteria) this;
        }

        public Criteria andNurseNoteIsNull() {
            addCriterion("nurse_note is null");
            return (Criteria) this;
        }

        public Criteria andNurseNoteIsNotNull() {
            addCriterion("nurse_note is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNoteEqualTo(String value) {
            addCriterion("nurse_note =", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteNotEqualTo(String value) {
            addCriterion("nurse_note <>", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteGreaterThan(String value) {
            addCriterion("nurse_note >", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_note >=", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteLessThan(String value) {
            addCriterion("nurse_note <", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteLessThanOrEqualTo(String value) {
            addCriterion("nurse_note <=", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteLike(String value) {
            addCriterion("nurse_note like", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteNotLike(String value) {
            addCriterion("nurse_note not like", value, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteIn(List<String> values) {
            addCriterion("nurse_note in", values, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteNotIn(List<String> values) {
            addCriterion("nurse_note not in", values, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteBetween(String value1, String value2) {
            addCriterion("nurse_note between", value1, value2, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNurseNoteNotBetween(String value1, String value2) {
            addCriterion("nurse_note not between", value1, value2, "nurseNote");
            return (Criteria) this;
        }

        public Criteria andNursePlaceIsNull() {
            addCriterion("nurse_place is null");
            return (Criteria) this;
        }

        public Criteria andNursePlaceIsNotNull() {
            addCriterion("nurse_place is not null");
            return (Criteria) this;
        }

        public Criteria andNursePlaceEqualTo(String value) {
            addCriterion("nurse_place =", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceNotEqualTo(String value) {
            addCriterion("nurse_place <>", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceGreaterThan(String value) {
            addCriterion("nurse_place >", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_place >=", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceLessThan(String value) {
            addCriterion("nurse_place <", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceLessThanOrEqualTo(String value) {
            addCriterion("nurse_place <=", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceLike(String value) {
            addCriterion("nurse_place like", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceNotLike(String value) {
            addCriterion("nurse_place not like", value, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceIn(List<String> values) {
            addCriterion("nurse_place in", values, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceNotIn(List<String> values) {
            addCriterion("nurse_place not in", values, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceBetween(String value1, String value2) {
            addCriterion("nurse_place between", value1, value2, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNursePlaceNotBetween(String value1, String value2) {
            addCriterion("nurse_place not between", value1, value2, "nursePlace");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceIsNull() {
            addCriterion("nurse_goodservice is null");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceIsNotNull() {
            addCriterion("nurse_goodservice is not null");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceEqualTo(String value) {
            addCriterion("nurse_goodservice =", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceNotEqualTo(String value) {
            addCriterion("nurse_goodservice <>", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceGreaterThan(String value) {
            addCriterion("nurse_goodservice >", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_goodservice >=", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceLessThan(String value) {
            addCriterion("nurse_goodservice <", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceLessThanOrEqualTo(String value) {
            addCriterion("nurse_goodservice <=", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceLike(String value) {
            addCriterion("nurse_goodservice like", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceNotLike(String value) {
            addCriterion("nurse_goodservice not like", value, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceIn(List<String> values) {
            addCriterion("nurse_goodservice in", values, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceNotIn(List<String> values) {
            addCriterion("nurse_goodservice not in", values, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceBetween(String value1, String value2) {
            addCriterion("nurse_goodservice between", value1, value2, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseGoodserviceNotBetween(String value1, String value2) {
            addCriterion("nurse_goodservice not between", value1, value2, "nurseGoodservice");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicIsNull() {
            addCriterion("nurse_nurse_licensepic is null");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicIsNotNull() {
            addCriterion("nurse_nurse_licensepic is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicEqualTo(String value) {
            addCriterion("nurse_nurse_licensepic =", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicNotEqualTo(String value) {
            addCriterion("nurse_nurse_licensepic <>", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicGreaterThan(String value) {
            addCriterion("nurse_nurse_licensepic >", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nurse_licensepic >=", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicLessThan(String value) {
            addCriterion("nurse_nurse_licensepic <", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicLessThanOrEqualTo(String value) {
            addCriterion("nurse_nurse_licensepic <=", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicLike(String value) {
            addCriterion("nurse_nurse_licensepic like", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicNotLike(String value) {
            addCriterion("nurse_nurse_licensepic not like", value, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicIn(List<String> values) {
            addCriterion("nurse_nurse_licensepic in", values, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicNotIn(List<String> values) {
            addCriterion("nurse_nurse_licensepic not in", values, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicBetween(String value1, String value2) {
            addCriterion("nurse_nurse_licensepic between", value1, value2, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseNurseLicensepicNotBetween(String value1, String value2) {
            addCriterion("nurse_nurse_licensepic not between", value1, value2, "nurseNurseLicensepic");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIsNull() {
            addCriterion("nurse_email is null");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIsNotNull() {
            addCriterion("nurse_email is not null");
            return (Criteria) this;
        }

        public Criteria andNurseEmailEqualTo(String value) {
            addCriterion("nurse_email =", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotEqualTo(String value) {
            addCriterion("nurse_email <>", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailGreaterThan(String value) {
            addCriterion("nurse_email >", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_email >=", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLessThan(String value) {
            addCriterion("nurse_email <", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLessThanOrEqualTo(String value) {
            addCriterion("nurse_email <=", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailLike(String value) {
            addCriterion("nurse_email like", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotLike(String value) {
            addCriterion("nurse_email not like", value, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailIn(List<String> values) {
            addCriterion("nurse_email in", values, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotIn(List<String> values) {
            addCriterion("nurse_email not in", values, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailBetween(String value1, String value2) {
            addCriterion("nurse_email between", value1, value2, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseEmailNotBetween(String value1, String value2) {
            addCriterion("nurse_email not between", value1, value2, "nurseEmail");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameIsNull() {
            addCriterion("nurse_truename is null");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameIsNotNull() {
            addCriterion("nurse_truename is not null");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameEqualTo(String value) {
            addCriterion("nurse_truename =", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameNotEqualTo(String value) {
            addCriterion("nurse_truename <>", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameGreaterThan(String value) {
            addCriterion("nurse_truename >", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_truename >=", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameLessThan(String value) {
            addCriterion("nurse_truename <", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameLessThanOrEqualTo(String value) {
            addCriterion("nurse_truename <=", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameLike(String value) {
            addCriterion("nurse_truename like", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameNotLike(String value) {
            addCriterion("nurse_truename not like", value, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameIn(List<String> values) {
            addCriterion("nurse_truename in", values, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameNotIn(List<String> values) {
            addCriterion("nurse_truename not in", values, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameBetween(String value1, String value2) {
            addCriterion("nurse_truename between", value1, value2, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseTruenameNotBetween(String value1, String value2) {
            addCriterion("nurse_truename not between", value1, value2, "nurseTruename");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicIsNull() {
            addCriterion("nurse_cardpic is null");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicIsNotNull() {
            addCriterion("nurse_cardpic is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicEqualTo(String value) {
            addCriterion("nurse_cardpic =", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicNotEqualTo(String value) {
            addCriterion("nurse_cardpic <>", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicGreaterThan(String value) {
            addCriterion("nurse_cardpic >", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_cardpic >=", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicLessThan(String value) {
            addCriterion("nurse_cardpic <", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicLessThanOrEqualTo(String value) {
            addCriterion("nurse_cardpic <=", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicLike(String value) {
            addCriterion("nurse_cardpic like", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicNotLike(String value) {
            addCriterion("nurse_cardpic not like", value, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicIn(List<String> values) {
            addCriterion("nurse_cardpic in", values, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicNotIn(List<String> values) {
            addCriterion("nurse_cardpic not in", values, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicBetween(String value1, String value2) {
            addCriterion("nurse_cardpic between", value1, value2, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardpicNotBetween(String value1, String value2) {
            addCriterion("nurse_cardpic not between", value1, value2, "nurseCardpic");
            return (Criteria) this;
        }

        public Criteria andNurseCardIsNull() {
            addCriterion("nurse_card is null");
            return (Criteria) this;
        }

        public Criteria andNurseCardIsNotNull() {
            addCriterion("nurse_card is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCardEqualTo(String value) {
            addCriterion("nurse_card =", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardNotEqualTo(String value) {
            addCriterion("nurse_card <>", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardGreaterThan(String value) {
            addCriterion("nurse_card >", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_card >=", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardLessThan(String value) {
            addCriterion("nurse_card <", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardLessThanOrEqualTo(String value) {
            addCriterion("nurse_card <=", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardLike(String value) {
            addCriterion("nurse_card like", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardNotLike(String value) {
            addCriterion("nurse_card not like", value, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardIn(List<String> values) {
            addCriterion("nurse_card in", values, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardNotIn(List<String> values) {
            addCriterion("nurse_card not in", values, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardBetween(String value1, String value2) {
            addCriterion("nurse_card between", value1, value2, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseCardNotBetween(String value1, String value2) {
            addCriterion("nurse_card not between", value1, value2, "nurseCard");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceIsNull() {
            addCriterion("nurse_province is null");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceIsNotNull() {
            addCriterion("nurse_province is not null");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceEqualTo(String value) {
            addCriterion("nurse_province =", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceNotEqualTo(String value) {
            addCriterion("nurse_province <>", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceGreaterThan(String value) {
            addCriterion("nurse_province >", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_province >=", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceLessThan(String value) {
            addCriterion("nurse_province <", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceLessThanOrEqualTo(String value) {
            addCriterion("nurse_province <=", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceLike(String value) {
            addCriterion("nurse_province like", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceNotLike(String value) {
            addCriterion("nurse_province not like", value, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceIn(List<String> values) {
            addCriterion("nurse_province in", values, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceNotIn(List<String> values) {
            addCriterion("nurse_province not in", values, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceBetween(String value1, String value2) {
            addCriterion("nurse_province between", value1, value2, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseProvinceNotBetween(String value1, String value2) {
            addCriterion("nurse_province not between", value1, value2, "nurseProvince");
            return (Criteria) this;
        }

        public Criteria andNurseCityIsNull() {
            addCriterion("nurse_city is null");
            return (Criteria) this;
        }

        public Criteria andNurseCityIsNotNull() {
            addCriterion("nurse_city is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCityEqualTo(String value) {
            addCriterion("nurse_city =", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotEqualTo(String value) {
            addCriterion("nurse_city <>", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityGreaterThan(String value) {
            addCriterion("nurse_city >", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_city >=", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLessThan(String value) {
            addCriterion("nurse_city <", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLessThanOrEqualTo(String value) {
            addCriterion("nurse_city <=", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityLike(String value) {
            addCriterion("nurse_city like", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotLike(String value) {
            addCriterion("nurse_city not like", value, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityIn(List<String> values) {
            addCriterion("nurse_city in", values, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotIn(List<String> values) {
            addCriterion("nurse_city not in", values, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityBetween(String value1, String value2) {
            addCriterion("nurse_city between", value1, value2, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseCityNotBetween(String value1, String value2) {
            addCriterion("nurse_city not between", value1, value2, "nurseCity");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictIsNull() {
            addCriterion("nurse_district is null");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictIsNotNull() {
            addCriterion("nurse_district is not null");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictEqualTo(String value) {
            addCriterion("nurse_district =", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictNotEqualTo(String value) {
            addCriterion("nurse_district <>", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictGreaterThan(String value) {
            addCriterion("nurse_district >", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_district >=", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictLessThan(String value) {
            addCriterion("nurse_district <", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictLessThanOrEqualTo(String value) {
            addCriterion("nurse_district <=", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictLike(String value) {
            addCriterion("nurse_district like", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictNotLike(String value) {
            addCriterion("nurse_district not like", value, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictIn(List<String> values) {
            addCriterion("nurse_district in", values, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictNotIn(List<String> values) {
            addCriterion("nurse_district not in", values, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictBetween(String value1, String value2) {
            addCriterion("nurse_district between", value1, value2, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseDistrictNotBetween(String value1, String value2) {
            addCriterion("nurse_district not between", value1, value2, "nurseDistrict");
            return (Criteria) this;
        }

        public Criteria andNurseSignIsNull() {
            addCriterion("nurse_sign is null");
            return (Criteria) this;
        }

        public Criteria andNurseSignIsNotNull() {
            addCriterion("nurse_sign is not null");
            return (Criteria) this;
        }

        public Criteria andNurseSignEqualTo(String value) {
            addCriterion("nurse_sign =", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignNotEqualTo(String value) {
            addCriterion("nurse_sign <>", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignGreaterThan(String value) {
            addCriterion("nurse_sign >", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_sign >=", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignLessThan(String value) {
            addCriterion("nurse_sign <", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignLessThanOrEqualTo(String value) {
            addCriterion("nurse_sign <=", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignLike(String value) {
            addCriterion("nurse_sign like", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignNotLike(String value) {
            addCriterion("nurse_sign not like", value, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignIn(List<String> values) {
            addCriterion("nurse_sign in", values, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignNotIn(List<String> values) {
            addCriterion("nurse_sign not in", values, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignBetween(String value1, String value2) {
            addCriterion("nurse_sign between", value1, value2, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNurseSignNotBetween(String value1, String value2) {
            addCriterion("nurse_sign not between", value1, value2, "nurseSign");
            return (Criteria) this;
        }

        public Criteria andNursePositionXIsNull() {
            addCriterion("nurse_position_x is null");
            return (Criteria) this;
        }

        public Criteria andNursePositionXIsNotNull() {
            addCriterion("nurse_position_x is not null");
            return (Criteria) this;
        }

        public Criteria andNursePositionXEqualTo(Double value) {
            addCriterion("nurse_position_x =", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXNotEqualTo(Double value) {
            addCriterion("nurse_position_x <>", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXGreaterThan(Double value) {
            addCriterion("nurse_position_x >", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXGreaterThanOrEqualTo(Double value) {
            addCriterion("nurse_position_x >=", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXLessThan(Double value) {
            addCriterion("nurse_position_x <", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXLessThanOrEqualTo(Double value) {
            addCriterion("nurse_position_x <=", value, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXIn(List<Double> values) {
            addCriterion("nurse_position_x in", values, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXNotIn(List<Double> values) {
            addCriterion("nurse_position_x not in", values, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXBetween(Double value1, Double value2) {
            addCriterion("nurse_position_x between", value1, value2, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionXNotBetween(Double value1, Double value2) {
            addCriterion("nurse_position_x not between", value1, value2, "nursePositionX");
            return (Criteria) this;
        }

        public Criteria andNursePositionYIsNull() {
            addCriterion("nurse_position_y is null");
            return (Criteria) this;
        }

        public Criteria andNursePositionYIsNotNull() {
            addCriterion("nurse_position_y is not null");
            return (Criteria) this;
        }

        public Criteria andNursePositionYEqualTo(Double value) {
            addCriterion("nurse_position_y =", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYNotEqualTo(Double value) {
            addCriterion("nurse_position_y <>", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYGreaterThan(Double value) {
            addCriterion("nurse_position_y >", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYGreaterThanOrEqualTo(Double value) {
            addCriterion("nurse_position_y >=", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYLessThan(Double value) {
            addCriterion("nurse_position_y <", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYLessThanOrEqualTo(Double value) {
            addCriterion("nurse_position_y <=", value, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYIn(List<Double> values) {
            addCriterion("nurse_position_y in", values, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYNotIn(List<Double> values) {
            addCriterion("nurse_position_y not in", values, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYBetween(Double value1, Double value2) {
            addCriterion("nurse_position_y between", value1, value2, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNursePositionYNotBetween(Double value1, Double value2) {
            addCriterion("nurse_position_y not between", value1, value2, "nursePositionY");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceIsNull() {
            addCriterion("nurse_balance is null");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceIsNotNull() {
            addCriterion("nurse_balance is not null");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceEqualTo(BigDecimal value) {
            addCriterion("nurse_balance =", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceNotEqualTo(BigDecimal value) {
            addCriterion("nurse_balance <>", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceGreaterThan(BigDecimal value) {
            addCriterion("nurse_balance >", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nurse_balance >=", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceLessThan(BigDecimal value) {
            addCriterion("nurse_balance <", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nurse_balance <=", value, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceIn(List<BigDecimal> values) {
            addCriterion("nurse_balance in", values, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceNotIn(List<BigDecimal> values) {
            addCriterion("nurse_balance not in", values, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nurse_balance between", value1, value2, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nurse_balance not between", value1, value2, "nurseBalance");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateIsNull() {
            addCriterion("nurse_usestate is null");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateIsNotNull() {
            addCriterion("nurse_usestate is not null");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateEqualTo(Integer value) {
            addCriterion("nurse_usestate =", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateNotEqualTo(Integer value) {
            addCriterion("nurse_usestate <>", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateGreaterThan(Integer value) {
            addCriterion("nurse_usestate >", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_usestate >=", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateLessThan(Integer value) {
            addCriterion("nurse_usestate <", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_usestate <=", value, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateIn(List<Integer> values) {
            addCriterion("nurse_usestate in", values, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateNotIn(List<Integer> values) {
            addCriterion("nurse_usestate not in", values, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateBetween(Integer value1, Integer value2) {
            addCriterion("nurse_usestate between", value1, value2, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseUsestateNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_usestate not between", value1, value2, "nurseUsestate");
            return (Criteria) this;
        }

        public Criteria andNurseMarkIsNull() {
            addCriterion("nurse_mark is null");
            return (Criteria) this;
        }

        public Criteria andNurseMarkIsNotNull() {
            addCriterion("nurse_mark is not null");
            return (Criteria) this;
        }

        public Criteria andNurseMarkEqualTo(Long value) {
            addCriterion("nurse_mark =", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkNotEqualTo(Long value) {
            addCriterion("nurse_mark <>", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkGreaterThan(Long value) {
            addCriterion("nurse_mark >", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkGreaterThanOrEqualTo(Long value) {
            addCriterion("nurse_mark >=", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkLessThan(Long value) {
            addCriterion("nurse_mark <", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkLessThanOrEqualTo(Long value) {
            addCriterion("nurse_mark <=", value, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkIn(List<Long> values) {
            addCriterion("nurse_mark in", values, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkNotIn(List<Long> values) {
            addCriterion("nurse_mark not in", values, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkBetween(Long value1, Long value2) {
            addCriterion("nurse_mark between", value1, value2, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseMarkNotBetween(Long value1, Long value2) {
            addCriterion("nurse_mark not between", value1, value2, "nurseMark");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeIsNull() {
            addCriterion("nurse_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeIsNotNull() {
            addCriterion("nurse_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeEqualTo(Date value) {
            addCriterion("nurse_createtime =", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeNotEqualTo(Date value) {
            addCriterion("nurse_createtime <>", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeGreaterThan(Date value) {
            addCriterion("nurse_createtime >", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_createtime >=", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeLessThan(Date value) {
            addCriterion("nurse_createtime <", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nurse_createtime <=", value, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeIn(List<Date> values) {
            addCriterion("nurse_createtime in", values, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeNotIn(List<Date> values) {
            addCriterion("nurse_createtime not in", values, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nurse_createtime between", value1, value2, "nurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nurse_createtime not between", value1, value2, "nurseCreatetime");
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