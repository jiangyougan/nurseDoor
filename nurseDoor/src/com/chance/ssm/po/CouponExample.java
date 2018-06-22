package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(BigDecimal value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(BigDecimal value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(BigDecimal value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(BigDecimal value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<BigDecimal> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<BigDecimal> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponPicIsNull() {
            addCriterion("coupon_pic is null");
            return (Criteria) this;
        }

        public Criteria andCouponPicIsNotNull() {
            addCriterion("coupon_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPicEqualTo(String value) {
            addCriterion("coupon_pic =", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicNotEqualTo(String value) {
            addCriterion("coupon_pic <>", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicGreaterThan(String value) {
            addCriterion("coupon_pic >", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_pic >=", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicLessThan(String value) {
            addCriterion("coupon_pic <", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicLessThanOrEqualTo(String value) {
            addCriterion("coupon_pic <=", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicLike(String value) {
            addCriterion("coupon_pic like", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicNotLike(String value) {
            addCriterion("coupon_pic not like", value, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicIn(List<String> values) {
            addCriterion("coupon_pic in", values, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicNotIn(List<String> values) {
            addCriterion("coupon_pic not in", values, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicBetween(String value1, String value2) {
            addCriterion("coupon_pic between", value1, value2, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponPicNotBetween(String value1, String value2) {
            addCriterion("coupon_pic not between", value1, value2, "couponPic");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveIsNull() {
            addCriterion("coupon_full_give is null");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveIsNotNull() {
            addCriterion("coupon_full_give is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveEqualTo(BigDecimal value) {
            addCriterion("coupon_full_give =", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveNotEqualTo(BigDecimal value) {
            addCriterion("coupon_full_give <>", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveGreaterThan(BigDecimal value) {
            addCriterion("coupon_full_give >", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_full_give >=", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveLessThan(BigDecimal value) {
            addCriterion("coupon_full_give <", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_full_give <=", value, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveIn(List<BigDecimal> values) {
            addCriterion("coupon_full_give in", values, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveNotIn(List<BigDecimal> values) {
            addCriterion("coupon_full_give not in", values, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_full_give between", value1, value2, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponFullGiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_full_give not between", value1, value2, "couponFullGive");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeIsNull() {
            addCriterion("coupon_expiration_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeIsNotNull() {
            addCriterion("coupon_expiration_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeEqualTo(Integer value) {
            addCriterion("coupon_expiration_time =", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeNotEqualTo(Integer value) {
            addCriterion("coupon_expiration_time <>", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeGreaterThan(Integer value) {
            addCriterion("coupon_expiration_time >", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_expiration_time >=", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeLessThan(Integer value) {
            addCriterion("coupon_expiration_time <", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_expiration_time <=", value, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeIn(List<Integer> values) {
            addCriterion("coupon_expiration_time in", values, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeNotIn(List<Integer> values) {
            addCriterion("coupon_expiration_time not in", values, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_expiration_time between", value1, value2, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponExpirationTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_expiration_time not between", value1, value2, "couponExpirationTime");
            return (Criteria) this;
        }

        public Criteria andCouponNoteIsNull() {
            addCriterion("coupon_note is null");
            return (Criteria) this;
        }

        public Criteria andCouponNoteIsNotNull() {
            addCriterion("coupon_note is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNoteEqualTo(String value) {
            addCriterion("coupon_note =", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteNotEqualTo(String value) {
            addCriterion("coupon_note <>", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteGreaterThan(String value) {
            addCriterion("coupon_note >", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_note >=", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteLessThan(String value) {
            addCriterion("coupon_note <", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteLessThanOrEqualTo(String value) {
            addCriterion("coupon_note <=", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteLike(String value) {
            addCriterion("coupon_note like", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteNotLike(String value) {
            addCriterion("coupon_note not like", value, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteIn(List<String> values) {
            addCriterion("coupon_note in", values, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteNotIn(List<String> values) {
            addCriterion("coupon_note not in", values, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteBetween(String value1, String value2) {
            addCriterion("coupon_note between", value1, value2, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponNoteNotBetween(String value1, String value2) {
            addCriterion("coupon_note not between", value1, value2, "couponNote");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakIsNull() {
            addCriterion("coupon_speak is null");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakIsNotNull() {
            addCriterion("coupon_speak is not null");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakEqualTo(String value) {
            addCriterion("coupon_speak =", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakNotEqualTo(String value) {
            addCriterion("coupon_speak <>", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakGreaterThan(String value) {
            addCriterion("coupon_speak >", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_speak >=", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakLessThan(String value) {
            addCriterion("coupon_speak <", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakLessThanOrEqualTo(String value) {
            addCriterion("coupon_speak <=", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakLike(String value) {
            addCriterion("coupon_speak like", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakNotLike(String value) {
            addCriterion("coupon_speak not like", value, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakIn(List<String> values) {
            addCriterion("coupon_speak in", values, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakNotIn(List<String> values) {
            addCriterion("coupon_speak not in", values, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakBetween(String value1, String value2) {
            addCriterion("coupon_speak between", value1, value2, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponSpeakNotBetween(String value1, String value2) {
            addCriterion("coupon_speak not between", value1, value2, "couponSpeak");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterIsNull() {
            addCriterion("coupon_creater is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterIsNotNull() {
            addCriterion("coupon_creater is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterEqualTo(String value) {
            addCriterion("coupon_creater =", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterNotEqualTo(String value) {
            addCriterion("coupon_creater <>", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterGreaterThan(String value) {
            addCriterion("coupon_creater >", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_creater >=", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterLessThan(String value) {
            addCriterion("coupon_creater <", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterLessThanOrEqualTo(String value) {
            addCriterion("coupon_creater <=", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterLike(String value) {
            addCriterion("coupon_creater like", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterNotLike(String value) {
            addCriterion("coupon_creater not like", value, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterIn(List<String> values) {
            addCriterion("coupon_creater in", values, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterNotIn(List<String> values) {
            addCriterion("coupon_creater not in", values, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterBetween(String value1, String value2) {
            addCriterion("coupon_creater between", value1, value2, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreaterNotBetween(String value1, String value2) {
            addCriterion("coupon_creater not between", value1, value2, "couponCreater");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIsNull() {
            addCriterion("coupon_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIsNotNull() {
            addCriterion("coupon_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeEqualTo(Date value) {
            addCriterion("coupon_createtime =", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotEqualTo(Date value) {
            addCriterion("coupon_createtime <>", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeGreaterThan(Date value) {
            addCriterion("coupon_createtime >", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_createtime >=", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeLessThan(Date value) {
            addCriterion("coupon_createtime <", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_createtime <=", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIn(List<Date> values) {
            addCriterion("coupon_createtime in", values, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotIn(List<Date> values) {
            addCriterion("coupon_createtime not in", values, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeBetween(Date value1, Date value2) {
            addCriterion("coupon_createtime between", value1, value2, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_createtime not between", value1, value2, "couponCreatetime");
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