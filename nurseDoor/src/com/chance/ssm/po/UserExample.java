package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIsNull() {
            addCriterion("user_header is null");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIsNotNull() {
            addCriterion("user_header is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeaderEqualTo(String value) {
            addCriterion("user_header =", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotEqualTo(String value) {
            addCriterion("user_header <>", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderGreaterThan(String value) {
            addCriterion("user_header >", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("user_header >=", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLessThan(String value) {
            addCriterion("user_header <", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLessThanOrEqualTo(String value) {
            addCriterion("user_header <=", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLike(String value) {
            addCriterion("user_header like", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotLike(String value) {
            addCriterion("user_header not like", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIn(List<String> values) {
            addCriterion("user_header in", values, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotIn(List<String> values) {
            addCriterion("user_header not in", values, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderBetween(String value1, String value2) {
            addCriterion("user_header between", value1, value2, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotBetween(String value1, String value2) {
            addCriterion("user_header not between", value1, value2, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNull() {
            addCriterion("user_nick is null");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNotNull() {
            addCriterion("user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickEqualTo(String value) {
            addCriterion("user_nick =", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotEqualTo(String value) {
            addCriterion("user_nick <>", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThan(String value) {
            addCriterion("user_nick >", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick >=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThan(String value) {
            addCriterion("user_nick <", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThanOrEqualTo(String value) {
            addCriterion("user_nick <=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLike(String value) {
            addCriterion("user_nick like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotLike(String value) {
            addCriterion("user_nick not like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickIn(List<String> values) {
            addCriterion("user_nick in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotIn(List<String> values) {
            addCriterion("user_nick not in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickBetween(String value1, String value2) {
            addCriterion("user_nick between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotBetween(String value1, String value2) {
            addCriterion("user_nick not between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeIsNull() {
            addCriterion("user_invitationcode is null");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeIsNotNull() {
            addCriterion("user_invitationcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeEqualTo(String value) {
            addCriterion("user_invitationcode =", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeNotEqualTo(String value) {
            addCriterion("user_invitationcode <>", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeGreaterThan(String value) {
            addCriterion("user_invitationcode >", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_invitationcode >=", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeLessThan(String value) {
            addCriterion("user_invitationcode <", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeLessThanOrEqualTo(String value) {
            addCriterion("user_invitationcode <=", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeLike(String value) {
            addCriterion("user_invitationcode like", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeNotLike(String value) {
            addCriterion("user_invitationcode not like", value, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeIn(List<String> values) {
            addCriterion("user_invitationcode in", values, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeNotIn(List<String> values) {
            addCriterion("user_invitationcode not in", values, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeBetween(String value1, String value2) {
            addCriterion("user_invitationcode between", value1, value2, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserInvitationcodeNotBetween(String value1, String value2) {
            addCriterion("user_invitationcode not between", value1, value2, "userInvitationcode");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(String value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(String value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(String value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(String value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(String value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(String value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLike(String value) {
            addCriterion("user_age like", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotLike(String value) {
            addCriterion("user_age not like", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<String> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<String> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(String value1, String value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(String value1, String value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserCardpicIsNull() {
            addCriterion("user_cardpic is null");
            return (Criteria) this;
        }

        public Criteria andUserCardpicIsNotNull() {
            addCriterion("user_cardpic is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardpicEqualTo(String value) {
            addCriterion("user_cardpic =", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicNotEqualTo(String value) {
            addCriterion("user_cardpic <>", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicGreaterThan(String value) {
            addCriterion("user_cardpic >", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicGreaterThanOrEqualTo(String value) {
            addCriterion("user_cardpic >=", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicLessThan(String value) {
            addCriterion("user_cardpic <", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicLessThanOrEqualTo(String value) {
            addCriterion("user_cardpic <=", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicLike(String value) {
            addCriterion("user_cardpic like", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicNotLike(String value) {
            addCriterion("user_cardpic not like", value, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicIn(List<String> values) {
            addCriterion("user_cardpic in", values, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicNotIn(List<String> values) {
            addCriterion("user_cardpic not in", values, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicBetween(String value1, String value2) {
            addCriterion("user_cardpic between", value1, value2, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserCardpicNotBetween(String value1, String value2) {
            addCriterion("user_cardpic not between", value1, value2, "userCardpic");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIsNull() {
            addCriterion("user_truename is null");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIsNotNull() {
            addCriterion("user_truename is not null");
            return (Criteria) this;
        }

        public Criteria andUserTruenameEqualTo(String value) {
            addCriterion("user_truename =", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotEqualTo(String value) {
            addCriterion("user_truename <>", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameGreaterThan(String value) {
            addCriterion("user_truename >", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_truename >=", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLessThan(String value) {
            addCriterion("user_truename <", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLessThanOrEqualTo(String value) {
            addCriterion("user_truename <=", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLike(String value) {
            addCriterion("user_truename like", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotLike(String value) {
            addCriterion("user_truename not like", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIn(List<String> values) {
            addCriterion("user_truename in", values, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotIn(List<String> values) {
            addCriterion("user_truename not in", values, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameBetween(String value1, String value2) {
            addCriterion("user_truename between", value1, value2, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotBetween(String value1, String value2) {
            addCriterion("user_truename not between", value1, value2, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNull() {
            addCriterion("user_card is null");
            return (Criteria) this;
        }

        public Criteria andUserCardIsNotNull() {
            addCriterion("user_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardEqualTo(String value) {
            addCriterion("user_card =", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotEqualTo(String value) {
            addCriterion("user_card <>", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThan(String value) {
            addCriterion("user_card >", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_card >=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThan(String value) {
            addCriterion("user_card <", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLessThanOrEqualTo(String value) {
            addCriterion("user_card <=", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardLike(String value) {
            addCriterion("user_card like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotLike(String value) {
            addCriterion("user_card not like", value, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardIn(List<String> values) {
            addCriterion("user_card in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotIn(List<String> values) {
            addCriterion("user_card not in", values, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardBetween(String value1, String value2) {
            addCriterion("user_card between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserCardNotBetween(String value1, String value2) {
            addCriterion("user_card not between", value1, value2, "userCard");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserDistrictIsNull() {
            addCriterion("user_district is null");
            return (Criteria) this;
        }

        public Criteria andUserDistrictIsNotNull() {
            addCriterion("user_district is not null");
            return (Criteria) this;
        }

        public Criteria andUserDistrictEqualTo(String value) {
            addCriterion("user_district =", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictNotEqualTo(String value) {
            addCriterion("user_district <>", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictGreaterThan(String value) {
            addCriterion("user_district >", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("user_district >=", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictLessThan(String value) {
            addCriterion("user_district <", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictLessThanOrEqualTo(String value) {
            addCriterion("user_district <=", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictLike(String value) {
            addCriterion("user_district like", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictNotLike(String value) {
            addCriterion("user_district not like", value, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictIn(List<String> values) {
            addCriterion("user_district in", values, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictNotIn(List<String> values) {
            addCriterion("user_district not in", values, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictBetween(String value1, String value2) {
            addCriterion("user_district between", value1, value2, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserDistrictNotBetween(String value1, String value2) {
            addCriterion("user_district not between", value1, value2, "userDistrict");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNull() {
            addCriterion("user_note is null");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNotNull() {
            addCriterion("user_note is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoteEqualTo(String value) {
            addCriterion("user_note =", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotEqualTo(String value) {
            addCriterion("user_note <>", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThan(String value) {
            addCriterion("user_note >", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThanOrEqualTo(String value) {
            addCriterion("user_note >=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThan(String value) {
            addCriterion("user_note <", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThanOrEqualTo(String value) {
            addCriterion("user_note <=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLike(String value) {
            addCriterion("user_note like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotLike(String value) {
            addCriterion("user_note not like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIn(List<String> values) {
            addCriterion("user_note in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotIn(List<String> values) {
            addCriterion("user_note not in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteBetween(String value1, String value2) {
            addCriterion("user_note between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotBetween(String value1, String value2) {
            addCriterion("user_note not between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserPositionXIsNull() {
            addCriterion("user_position_x is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionXIsNotNull() {
            addCriterion("user_position_x is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionXEqualTo(Double value) {
            addCriterion("user_position_x =", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXNotEqualTo(Double value) {
            addCriterion("user_position_x <>", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXGreaterThan(Double value) {
            addCriterion("user_position_x >", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXGreaterThanOrEqualTo(Double value) {
            addCriterion("user_position_x >=", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXLessThan(Double value) {
            addCriterion("user_position_x <", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXLessThanOrEqualTo(Double value) {
            addCriterion("user_position_x <=", value, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXIn(List<Double> values) {
            addCriterion("user_position_x in", values, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXNotIn(List<Double> values) {
            addCriterion("user_position_x not in", values, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXBetween(Double value1, Double value2) {
            addCriterion("user_position_x between", value1, value2, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionXNotBetween(Double value1, Double value2) {
            addCriterion("user_position_x not between", value1, value2, "userPositionX");
            return (Criteria) this;
        }

        public Criteria andUserPositionYIsNull() {
            addCriterion("user_position_y is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionYIsNotNull() {
            addCriterion("user_position_y is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionYEqualTo(Double value) {
            addCriterion("user_position_y =", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYNotEqualTo(Double value) {
            addCriterion("user_position_y <>", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYGreaterThan(Double value) {
            addCriterion("user_position_y >", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYGreaterThanOrEqualTo(Double value) {
            addCriterion("user_position_y >=", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYLessThan(Double value) {
            addCriterion("user_position_y <", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYLessThanOrEqualTo(Double value) {
            addCriterion("user_position_y <=", value, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYIn(List<Double> values) {
            addCriterion("user_position_y in", values, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYNotIn(List<Double> values) {
            addCriterion("user_position_y not in", values, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYBetween(Double value1, Double value2) {
            addCriterion("user_position_y between", value1, value2, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserPositionYNotBetween(Double value1, Double value2) {
            addCriterion("user_position_y not between", value1, value2, "userPositionY");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateIsNull() {
            addCriterion("user_idenstate is null");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateIsNotNull() {
            addCriterion("user_idenstate is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateEqualTo(String value) {
            addCriterion("user_idenstate =", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateNotEqualTo(String value) {
            addCriterion("user_idenstate <>", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateGreaterThan(String value) {
            addCriterion("user_idenstate >", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateGreaterThanOrEqualTo(String value) {
            addCriterion("user_idenstate >=", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateLessThan(String value) {
            addCriterion("user_idenstate <", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateLessThanOrEqualTo(String value) {
            addCriterion("user_idenstate <=", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateLike(String value) {
            addCriterion("user_idenstate like", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateNotLike(String value) {
            addCriterion("user_idenstate not like", value, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateIn(List<String> values) {
            addCriterion("user_idenstate in", values, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateNotIn(List<String> values) {
            addCriterion("user_idenstate not in", values, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateBetween(String value1, String value2) {
            addCriterion("user_idenstate between", value1, value2, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserIdenstateNotBetween(String value1, String value2) {
            addCriterion("user_idenstate not between", value1, value2, "userIdenstate");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNull() {
            addCriterion("user_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNotNull() {
            addCriterion("user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceEqualTo(BigDecimal value) {
            addCriterion("user_balance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotEqualTo(BigDecimal value) {
            addCriterion("user_balance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThan(BigDecimal value) {
            addCriterion("user_balance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_balance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThan(BigDecimal value) {
            addCriterion("user_balance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_balance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIn(List<BigDecimal> values) {
            addCriterion("user_balance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotIn(List<BigDecimal> values) {
            addCriterion("user_balance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_balance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_balance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserUsestateIsNull() {
            addCriterion("user_usestate is null");
            return (Criteria) this;
        }

        public Criteria andUserUsestateIsNotNull() {
            addCriterion("user_usestate is not null");
            return (Criteria) this;
        }

        public Criteria andUserUsestateEqualTo(String value) {
            addCriterion("user_usestate =", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateNotEqualTo(String value) {
            addCriterion("user_usestate <>", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateGreaterThan(String value) {
            addCriterion("user_usestate >", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateGreaterThanOrEqualTo(String value) {
            addCriterion("user_usestate >=", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateLessThan(String value) {
            addCriterion("user_usestate <", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateLessThanOrEqualTo(String value) {
            addCriterion("user_usestate <=", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateLike(String value) {
            addCriterion("user_usestate like", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateNotLike(String value) {
            addCriterion("user_usestate not like", value, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateIn(List<String> values) {
            addCriterion("user_usestate in", values, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateNotIn(List<String> values) {
            addCriterion("user_usestate not in", values, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateBetween(String value1, String value2) {
            addCriterion("user_usestate between", value1, value2, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserUsestateNotBetween(String value1, String value2) {
            addCriterion("user_usestate not between", value1, value2, "userUsestate");
            return (Criteria) this;
        }

        public Criteria andUserMarkIsNull() {
            addCriterion("user_mark is null");
            return (Criteria) this;
        }

        public Criteria andUserMarkIsNotNull() {
            addCriterion("user_mark is not null");
            return (Criteria) this;
        }

        public Criteria andUserMarkEqualTo(Long value) {
            addCriterion("user_mark =", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotEqualTo(Long value) {
            addCriterion("user_mark <>", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkGreaterThan(Long value) {
            addCriterion("user_mark >", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkGreaterThanOrEqualTo(Long value) {
            addCriterion("user_mark >=", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkLessThan(Long value) {
            addCriterion("user_mark <", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkLessThanOrEqualTo(Long value) {
            addCriterion("user_mark <=", value, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkIn(List<Long> values) {
            addCriterion("user_mark in", values, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotIn(List<Long> values) {
            addCriterion("user_mark not in", values, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkBetween(Long value1, Long value2) {
            addCriterion("user_mark between", value1, value2, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserMarkNotBetween(Long value1, Long value2) {
            addCriterion("user_mark not between", value1, value2, "userMark");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNull() {
            addCriterion("user_createtime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNotNull() {
            addCriterion("user_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeEqualTo(Date value) {
            addCriterion("user_createtime =", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotEqualTo(Date value) {
            addCriterion("user_createtime <>", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThan(Date value) {
            addCriterion("user_createtime >", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_createtime >=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThan(Date value) {
            addCriterion("user_createtime <", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("user_createtime <=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIn(List<Date> values) {
            addCriterion("user_createtime in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotIn(List<Date> values) {
            addCriterion("user_createtime not in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeBetween(Date value1, Date value2) {
            addCriterion("user_createtime between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("user_createtime not between", value1, value2, "userCreatetime");
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