package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponUserExample() {
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

        public Criteria andCouponUserIdIsNull() {
            addCriterion("coupon_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdIsNotNull() {
            addCriterion("coupon_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdEqualTo(String value) {
            addCriterion("coupon_user_id =", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdNotEqualTo(String value) {
            addCriterion("coupon_user_id <>", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdGreaterThan(String value) {
            addCriterion("coupon_user_id >", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_id >=", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdLessThan(String value) {
            addCriterion("coupon_user_id <", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_id <=", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdLike(String value) {
            addCriterion("coupon_user_id like", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdNotLike(String value) {
            addCriterion("coupon_user_id not like", value, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdIn(List<String> values) {
            addCriterion("coupon_user_id in", values, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdNotIn(List<String> values) {
            addCriterion("coupon_user_id not in", values, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdBetween(String value1, String value2) {
            addCriterion("coupon_user_id between", value1, value2, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserIdNotBetween(String value1, String value2) {
            addCriterion("coupon_user_id not between", value1, value2, "couponUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdIsNull() {
            addCriterion("coupon_user_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdIsNotNull() {
            addCriterion("coupon_user_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdEqualTo(String value) {
            addCriterion("coupon_user_user_id =", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdNotEqualTo(String value) {
            addCriterion("coupon_user_user_id <>", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdGreaterThan(String value) {
            addCriterion("coupon_user_user_id >", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_user_id >=", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdLessThan(String value) {
            addCriterion("coupon_user_user_id <", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_user_id <=", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdLike(String value) {
            addCriterion("coupon_user_user_id like", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdNotLike(String value) {
            addCriterion("coupon_user_user_id not like", value, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdIn(List<String> values) {
            addCriterion("coupon_user_user_id in", values, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdNotIn(List<String> values) {
            addCriterion("coupon_user_user_id not in", values, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdBetween(String value1, String value2) {
            addCriterion("coupon_user_user_id between", value1, value2, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserUserIdNotBetween(String value1, String value2) {
            addCriterion("coupon_user_user_id not between", value1, value2, "couponUserUserId");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyIsNull() {
            addCriterion("coupon_user_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyIsNotNull() {
            addCriterion("coupon_user_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyEqualTo(BigDecimal value) {
            addCriterion("coupon_user_money =", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyNotEqualTo(BigDecimal value) {
            addCriterion("coupon_user_money <>", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyGreaterThan(BigDecimal value) {
            addCriterion("coupon_user_money >", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_user_money >=", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyLessThan(BigDecimal value) {
            addCriterion("coupon_user_money <", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_user_money <=", value, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyIn(List<BigDecimal> values) {
            addCriterion("coupon_user_money in", values, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyNotIn(List<BigDecimal> values) {
            addCriterion("coupon_user_money not in", values, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_user_money between", value1, value2, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_user_money not between", value1, value2, "couponUserMoney");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicIsNull() {
            addCriterion("coupon_user_pic is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicIsNotNull() {
            addCriterion("coupon_user_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicEqualTo(String value) {
            addCriterion("coupon_user_pic =", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicNotEqualTo(String value) {
            addCriterion("coupon_user_pic <>", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicGreaterThan(String value) {
            addCriterion("coupon_user_pic >", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_pic >=", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicLessThan(String value) {
            addCriterion("coupon_user_pic <", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_pic <=", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicLike(String value) {
            addCriterion("coupon_user_pic like", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicNotLike(String value) {
            addCriterion("coupon_user_pic not like", value, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicIn(List<String> values) {
            addCriterion("coupon_user_pic in", values, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicNotIn(List<String> values) {
            addCriterion("coupon_user_pic not in", values, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicBetween(String value1, String value2) {
            addCriterion("coupon_user_pic between", value1, value2, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserPicNotBetween(String value1, String value2) {
            addCriterion("coupon_user_pic not between", value1, value2, "couponUserPic");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveIsNull() {
            addCriterion("coupon_user_full_give is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveIsNotNull() {
            addCriterion("coupon_user_full_give is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveEqualTo(BigDecimal value) {
            addCriterion("coupon_user_full_give =", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveNotEqualTo(BigDecimal value) {
            addCriterion("coupon_user_full_give <>", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveGreaterThan(BigDecimal value) {
            addCriterion("coupon_user_full_give >", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_user_full_give >=", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveLessThan(BigDecimal value) {
            addCriterion("coupon_user_full_give <", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_user_full_give <=", value, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveIn(List<BigDecimal> values) {
            addCriterion("coupon_user_full_give in", values, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveNotIn(List<BigDecimal> values) {
            addCriterion("coupon_user_full_give not in", values, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_user_full_give between", value1, value2, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserFullGiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_user_full_give not between", value1, value2, "couponUserFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeIsNull() {
            addCriterion("coupon_user_expiration_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeIsNotNull() {
            addCriterion("coupon_user_expiration_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeEqualTo(Date value) {
            addCriterion("coupon_user_expiration_time =", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeNotEqualTo(Date value) {
            addCriterion("coupon_user_expiration_time <>", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeGreaterThan(Date value) {
            addCriterion("coupon_user_expiration_time >", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_user_expiration_time >=", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeLessThan(Date value) {
            addCriterion("coupon_user_expiration_time <", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_user_expiration_time <=", value, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeIn(List<Date> values) {
            addCriterion("coupon_user_expiration_time in", values, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeNotIn(List<Date> values) {
            addCriterion("coupon_user_expiration_time not in", values, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeBetween(Date value1, Date value2) {
            addCriterion("coupon_user_expiration_time between", value1, value2, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserExpirationTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_user_expiration_time not between", value1, value2, "couponUserExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseIsNull() {
            addCriterion("coupon_user_istouse is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseIsNotNull() {
            addCriterion("coupon_user_istouse is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseEqualTo(Integer value) {
            addCriterion("coupon_user_istouse =", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseNotEqualTo(Integer value) {
            addCriterion("coupon_user_istouse <>", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseGreaterThan(Integer value) {
            addCriterion("coupon_user_istouse >", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_user_istouse >=", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseLessThan(Integer value) {
            addCriterion("coupon_user_istouse <", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_user_istouse <=", value, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseIn(List<Integer> values) {
            addCriterion("coupon_user_istouse in", values, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseNotIn(List<Integer> values) {
            addCriterion("coupon_user_istouse not in", values, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseBetween(Integer value1, Integer value2) {
            addCriterion("coupon_user_istouse between", value1, value2, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserIstouseNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_user_istouse not between", value1, value2, "couponUserIstouse");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteIsNull() {
            addCriterion("coupon_user_note is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteIsNotNull() {
            addCriterion("coupon_user_note is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteEqualTo(String value) {
            addCriterion("coupon_user_note =", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteNotEqualTo(String value) {
            addCriterion("coupon_user_note <>", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteGreaterThan(String value) {
            addCriterion("coupon_user_note >", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_note >=", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteLessThan(String value) {
            addCriterion("coupon_user_note <", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_note <=", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteLike(String value) {
            addCriterion("coupon_user_note like", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteNotLike(String value) {
            addCriterion("coupon_user_note not like", value, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteIn(List<String> values) {
            addCriterion("coupon_user_note in", values, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteNotIn(List<String> values) {
            addCriterion("coupon_user_note not in", values, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteBetween(String value1, String value2) {
            addCriterion("coupon_user_note between", value1, value2, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserNoteNotBetween(String value1, String value2) {
            addCriterion("coupon_user_note not between", value1, value2, "couponUserNote");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakIsNull() {
            addCriterion("coupon_user_sperak is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakIsNotNull() {
            addCriterion("coupon_user_sperak is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakEqualTo(String value) {
            addCriterion("coupon_user_sperak =", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakNotEqualTo(String value) {
            addCriterion("coupon_user_sperak <>", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakGreaterThan(String value) {
            addCriterion("coupon_user_sperak >", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_sperak >=", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakLessThan(String value) {
            addCriterion("coupon_user_sperak <", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_sperak <=", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakLike(String value) {
            addCriterion("coupon_user_sperak like", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakNotLike(String value) {
            addCriterion("coupon_user_sperak not like", value, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakIn(List<String> values) {
            addCriterion("coupon_user_sperak in", values, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakNotIn(List<String> values) {
            addCriterion("coupon_user_sperak not in", values, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakBetween(String value1, String value2) {
            addCriterion("coupon_user_sperak between", value1, value2, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserSperakNotBetween(String value1, String value2) {
            addCriterion("coupon_user_sperak not between", value1, value2, "couponUserSperak");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterIsNull() {
            addCriterion("coupon_user_createter is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterIsNotNull() {
            addCriterion("coupon_user_createter is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterEqualTo(String value) {
            addCriterion("coupon_user_createter =", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterNotEqualTo(String value) {
            addCriterion("coupon_user_createter <>", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterGreaterThan(String value) {
            addCriterion("coupon_user_createter >", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_user_createter >=", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterLessThan(String value) {
            addCriterion("coupon_user_createter <", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterLessThanOrEqualTo(String value) {
            addCriterion("coupon_user_createter <=", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterLike(String value) {
            addCriterion("coupon_user_createter like", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterNotLike(String value) {
            addCriterion("coupon_user_createter not like", value, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterIn(List<String> values) {
            addCriterion("coupon_user_createter in", values, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterNotIn(List<String> values) {
            addCriterion("coupon_user_createter not in", values, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterBetween(String value1, String value2) {
            addCriterion("coupon_user_createter between", value1, value2, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreateterNotBetween(String value1, String value2) {
            addCriterion("coupon_user_createter not between", value1, value2, "couponUserCreateter");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeIsNull() {
            addCriterion("coupon_user_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeIsNotNull() {
            addCriterion("coupon_user_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeEqualTo(Date value) {
            addCriterion("coupon_user_createtime =", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeNotEqualTo(Date value) {
            addCriterion("coupon_user_createtime <>", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeGreaterThan(Date value) {
            addCriterion("coupon_user_createtime >", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_user_createtime >=", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeLessThan(Date value) {
            addCriterion("coupon_user_createtime <", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_user_createtime <=", value, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeIn(List<Date> values) {
            addCriterion("coupon_user_createtime in", values, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeNotIn(List<Date> values) {
            addCriterion("coupon_user_createtime not in", values, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeBetween(Date value1, Date value2) {
            addCriterion("coupon_user_createtime between", value1, value2, "couponUserCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponUserCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_user_createtime not between", value1, value2, "couponUserCreatetime");
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