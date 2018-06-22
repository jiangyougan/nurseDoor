package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServicePhoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerServicePhoneExample() {
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

        public Criteria andCustomerServicePhoneIdIsNull() {
            addCriterion("customer_service_phone_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdIsNotNull() {
            addCriterion("customer_service_phone_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdEqualTo(String value) {
            addCriterion("customer_service_phone_id =", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdNotEqualTo(String value) {
            addCriterion("customer_service_phone_id <>", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdGreaterThan(String value) {
            addCriterion("customer_service_phone_id >", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_id >=", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdLessThan(String value) {
            addCriterion("customer_service_phone_id <", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_id <=", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdLike(String value) {
            addCriterion("customer_service_phone_id like", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdNotLike(String value) {
            addCriterion("customer_service_phone_id not like", value, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdIn(List<String> values) {
            addCriterion("customer_service_phone_id in", values, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdNotIn(List<String> values) {
            addCriterion("customer_service_phone_id not in", values, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdBetween(String value1, String value2) {
            addCriterion("customer_service_phone_id between", value1, value2, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIdNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone_id not between", value1, value2, "customerServicePhoneId");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsNull() {
            addCriterion("customer_service_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsNotNull() {
            addCriterion("customer_service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneEqualTo(String value) {
            addCriterion("customer_service_phone =", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotEqualTo(String value) {
            addCriterion("customer_service_phone <>", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneGreaterThan(String value) {
            addCriterion("customer_service_phone >", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone >=", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLessThan(String value) {
            addCriterion("customer_service_phone <", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone <=", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneLike(String value) {
            addCriterion("customer_service_phone like", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotLike(String value) {
            addCriterion("customer_service_phone not like", value, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIn(List<String> values) {
            addCriterion("customer_service_phone in", values, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotIn(List<String> values) {
            addCriterion("customer_service_phone not in", values, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneBetween(String value1, String value2) {
            addCriterion("customer_service_phone between", value1, value2, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone not between", value1, value2, "customerServicePhone");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultIsNull() {
            addCriterion("customer_service_phone_default is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultIsNotNull() {
            addCriterion("customer_service_phone_default is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultEqualTo(Integer value) {
            addCriterion("customer_service_phone_default =", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultNotEqualTo(Integer value) {
            addCriterion("customer_service_phone_default <>", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultGreaterThan(Integer value) {
            addCriterion("customer_service_phone_default >", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_service_phone_default >=", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultLessThan(Integer value) {
            addCriterion("customer_service_phone_default <", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("customer_service_phone_default <=", value, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultIn(List<Integer> values) {
            addCriterion("customer_service_phone_default in", values, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultNotIn(List<Integer> values) {
            addCriterion("customer_service_phone_default not in", values, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_phone_default between", value1, value2, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_phone_default not between", value1, value2, "customerServicePhoneDefault");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseIsNull() {
            addCriterion("customer_service_phone_isuse is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseIsNotNull() {
            addCriterion("customer_service_phone_isuse is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseEqualTo(Integer value) {
            addCriterion("customer_service_phone_isuse =", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseNotEqualTo(Integer value) {
            addCriterion("customer_service_phone_isuse <>", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseGreaterThan(Integer value) {
            addCriterion("customer_service_phone_isuse >", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_service_phone_isuse >=", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseLessThan(Integer value) {
            addCriterion("customer_service_phone_isuse <", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseLessThanOrEqualTo(Integer value) {
            addCriterion("customer_service_phone_isuse <=", value, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseIn(List<Integer> values) {
            addCriterion("customer_service_phone_isuse in", values, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseNotIn(List<Integer> values) {
            addCriterion("customer_service_phone_isuse not in", values, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_phone_isuse between", value1, value2, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneIsuseNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_service_phone_isuse not between", value1, value2, "customerServicePhoneIsuse");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteIsNull() {
            addCriterion("customer_service_phone_note is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteIsNotNull() {
            addCriterion("customer_service_phone_note is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteEqualTo(String value) {
            addCriterion("customer_service_phone_note =", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteNotEqualTo(String value) {
            addCriterion("customer_service_phone_note <>", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteGreaterThan(String value) {
            addCriterion("customer_service_phone_note >", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_note >=", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteLessThan(String value) {
            addCriterion("customer_service_phone_note <", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_note <=", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteLike(String value) {
            addCriterion("customer_service_phone_note like", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteNotLike(String value) {
            addCriterion("customer_service_phone_note not like", value, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteIn(List<String> values) {
            addCriterion("customer_service_phone_note in", values, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteNotIn(List<String> values) {
            addCriterion("customer_service_phone_note not in", values, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteBetween(String value1, String value2) {
            addCriterion("customer_service_phone_note between", value1, value2, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneNoteNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone_note not between", value1, value2, "customerServicePhoneNote");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakIsNull() {
            addCriterion("customer_service_phone_sepak is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakIsNotNull() {
            addCriterion("customer_service_phone_sepak is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakEqualTo(String value) {
            addCriterion("customer_service_phone_sepak =", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakNotEqualTo(String value) {
            addCriterion("customer_service_phone_sepak <>", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakGreaterThan(String value) {
            addCriterion("customer_service_phone_sepak >", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_sepak >=", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakLessThan(String value) {
            addCriterion("customer_service_phone_sepak <", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_sepak <=", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakLike(String value) {
            addCriterion("customer_service_phone_sepak like", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakNotLike(String value) {
            addCriterion("customer_service_phone_sepak not like", value, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakIn(List<String> values) {
            addCriterion("customer_service_phone_sepak in", values, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakNotIn(List<String> values) {
            addCriterion("customer_service_phone_sepak not in", values, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakBetween(String value1, String value2) {
            addCriterion("customer_service_phone_sepak between", value1, value2, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneSepakNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone_sepak not between", value1, value2, "customerServicePhoneSepak");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerIsNull() {
            addCriterion("customer_service_phone_voer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerIsNotNull() {
            addCriterion("customer_service_phone_voer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerEqualTo(String value) {
            addCriterion("customer_service_phone_voer =", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerNotEqualTo(String value) {
            addCriterion("customer_service_phone_voer <>", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerGreaterThan(String value) {
            addCriterion("customer_service_phone_voer >", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_voer >=", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerLessThan(String value) {
            addCriterion("customer_service_phone_voer <", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_voer <=", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerLike(String value) {
            addCriterion("customer_service_phone_voer like", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerNotLike(String value) {
            addCriterion("customer_service_phone_voer not like", value, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerIn(List<String> values) {
            addCriterion("customer_service_phone_voer in", values, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerNotIn(List<String> values) {
            addCriterion("customer_service_phone_voer not in", values, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerBetween(String value1, String value2) {
            addCriterion("customer_service_phone_voer between", value1, value2, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneVoerNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone_voer not between", value1, value2, "customerServicePhoneVoer");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeIsNull() {
            addCriterion("customer_service_phone_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeIsNotNull() {
            addCriterion("customer_service_phone_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeEqualTo(Date value) {
            addCriterion("customer_service_phone_createtime =", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeNotEqualTo(Date value) {
            addCriterion("customer_service_phone_createtime <>", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeGreaterThan(Date value) {
            addCriterion("customer_service_phone_createtime >", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_service_phone_createtime >=", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeLessThan(Date value) {
            addCriterion("customer_service_phone_createtime <", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_service_phone_createtime <=", value, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeIn(List<Date> values) {
            addCriterion("customer_service_phone_createtime in", values, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeNotIn(List<Date> values) {
            addCriterion("customer_service_phone_createtime not in", values, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeBetween(Date value1, Date value2) {
            addCriterion("customer_service_phone_createtime between", value1, value2, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_service_phone_createtime not between", value1, value2, "customerServicePhoneCreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeIsNull() {
            addCriterion("customer_service_phone_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeIsNotNull() {
            addCriterion("customer_service_phone_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeEqualTo(Date value) {
            addCriterion("customer_service_phone_updatetime =", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeNotEqualTo(Date value) {
            addCriterion("customer_service_phone_updatetime <>", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeGreaterThan(Date value) {
            addCriterion("customer_service_phone_updatetime >", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_service_phone_updatetime >=", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeLessThan(Date value) {
            addCriterion("customer_service_phone_updatetime <", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_service_phone_updatetime <=", value, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeIn(List<Date> values) {
            addCriterion("customer_service_phone_updatetime in", values, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeNotIn(List<Date> values) {
            addCriterion("customer_service_phone_updatetime not in", values, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("customer_service_phone_updatetime between", value1, value2, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_service_phone_updatetime not between", value1, value2, "customerServicePhoneUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterIsNull() {
            addCriterion("customer_service_phone_createter is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterIsNotNull() {
            addCriterion("customer_service_phone_createter is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterEqualTo(String value) {
            addCriterion("customer_service_phone_createter =", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterNotEqualTo(String value) {
            addCriterion("customer_service_phone_createter <>", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterGreaterThan(String value) {
            addCriterion("customer_service_phone_createter >", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_createter >=", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterLessThan(String value) {
            addCriterion("customer_service_phone_createter <", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterLessThanOrEqualTo(String value) {
            addCriterion("customer_service_phone_createter <=", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterLike(String value) {
            addCriterion("customer_service_phone_createter like", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterNotLike(String value) {
            addCriterion("customer_service_phone_createter not like", value, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterIn(List<String> values) {
            addCriterion("customer_service_phone_createter in", values, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterNotIn(List<String> values) {
            addCriterion("customer_service_phone_createter not in", values, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterBetween(String value1, String value2) {
            addCriterion("customer_service_phone_createter between", value1, value2, "customerServicePhoneCreateter");
            return (Criteria) this;
        }

        public Criteria andCustomerServicePhoneCreateterNotBetween(String value1, String value2) {
            addCriterion("customer_service_phone_createter not between", value1, value2, "customerServicePhoneCreateter");
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