package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdministrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministrationExample() {
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

        public Criteria andAdministrationIdIsNull() {
            addCriterion("administration_id is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdIsNotNull() {
            addCriterion("administration_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdEqualTo(String value) {
            addCriterion("administration_id =", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdNotEqualTo(String value) {
            addCriterion("administration_id <>", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdGreaterThan(String value) {
            addCriterion("administration_id >", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdGreaterThanOrEqualTo(String value) {
            addCriterion("administration_id >=", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdLessThan(String value) {
            addCriterion("administration_id <", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdLessThanOrEqualTo(String value) {
            addCriterion("administration_id <=", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdLike(String value) {
            addCriterion("administration_id like", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdNotLike(String value) {
            addCriterion("administration_id not like", value, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdIn(List<String> values) {
            addCriterion("administration_id in", values, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdNotIn(List<String> values) {
            addCriterion("administration_id not in", values, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdBetween(String value1, String value2) {
            addCriterion("administration_id between", value1, value2, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationIdNotBetween(String value1, String value2) {
            addCriterion("administration_id not between", value1, value2, "administrationId");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameIsNull() {
            addCriterion("administration_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameIsNotNull() {
            addCriterion("administration_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameEqualTo(String value) {
            addCriterion("administration_name =", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameNotEqualTo(String value) {
            addCriterion("administration_name <>", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameGreaterThan(String value) {
            addCriterion("administration_name >", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameGreaterThanOrEqualTo(String value) {
            addCriterion("administration_name >=", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameLessThan(String value) {
            addCriterion("administration_name <", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameLessThanOrEqualTo(String value) {
            addCriterion("administration_name <=", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameLike(String value) {
            addCriterion("administration_name like", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameNotLike(String value) {
            addCriterion("administration_name not like", value, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameIn(List<String> values) {
            addCriterion("administration_name in", values, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameNotIn(List<String> values) {
            addCriterion("administration_name not in", values, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameBetween(String value1, String value2) {
            addCriterion("administration_name between", value1, value2, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationNameNotBetween(String value1, String value2) {
            addCriterion("administration_name not between", value1, value2, "administrationName");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdIsNull() {
            addCriterion("administration_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdIsNotNull() {
            addCriterion("administration_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdEqualTo(String value) {
            addCriterion("administration_pwd =", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdNotEqualTo(String value) {
            addCriterion("administration_pwd <>", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdGreaterThan(String value) {
            addCriterion("administration_pwd >", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdGreaterThanOrEqualTo(String value) {
            addCriterion("administration_pwd >=", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdLessThan(String value) {
            addCriterion("administration_pwd <", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdLessThanOrEqualTo(String value) {
            addCriterion("administration_pwd <=", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdLike(String value) {
            addCriterion("administration_pwd like", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdNotLike(String value) {
            addCriterion("administration_pwd not like", value, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdIn(List<String> values) {
            addCriterion("administration_pwd in", values, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdNotIn(List<String> values) {
            addCriterion("administration_pwd not in", values, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdBetween(String value1, String value2) {
            addCriterion("administration_pwd between", value1, value2, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationPwdNotBetween(String value1, String value2) {
            addCriterion("administration_pwd not between", value1, value2, "administrationPwd");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickIsNull() {
            addCriterion("administration_nick is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickIsNotNull() {
            addCriterion("administration_nick is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickEqualTo(String value) {
            addCriterion("administration_nick =", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickNotEqualTo(String value) {
            addCriterion("administration_nick <>", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickGreaterThan(String value) {
            addCriterion("administration_nick >", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickGreaterThanOrEqualTo(String value) {
            addCriterion("administration_nick >=", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickLessThan(String value) {
            addCriterion("administration_nick <", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickLessThanOrEqualTo(String value) {
            addCriterion("administration_nick <=", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickLike(String value) {
            addCriterion("administration_nick like", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickNotLike(String value) {
            addCriterion("administration_nick not like", value, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickIn(List<String> values) {
            addCriterion("administration_nick in", values, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickNotIn(List<String> values) {
            addCriterion("administration_nick not in", values, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickBetween(String value1, String value2) {
            addCriterion("administration_nick between", value1, value2, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationNickNotBetween(String value1, String value2) {
            addCriterion("administration_nick not between", value1, value2, "administrationNick");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameIsNull() {
            addCriterion("administration_true_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameIsNotNull() {
            addCriterion("administration_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameEqualTo(String value) {
            addCriterion("administration_true_name =", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameNotEqualTo(String value) {
            addCriterion("administration_true_name <>", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameGreaterThan(String value) {
            addCriterion("administration_true_name >", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("administration_true_name >=", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameLessThan(String value) {
            addCriterion("administration_true_name <", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameLessThanOrEqualTo(String value) {
            addCriterion("administration_true_name <=", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameLike(String value) {
            addCriterion("administration_true_name like", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameNotLike(String value) {
            addCriterion("administration_true_name not like", value, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameIn(List<String> values) {
            addCriterion("administration_true_name in", values, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameNotIn(List<String> values) {
            addCriterion("administration_true_name not in", values, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameBetween(String value1, String value2) {
            addCriterion("administration_true_name between", value1, value2, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationTrueNameNotBetween(String value1, String value2) {
            addCriterion("administration_true_name not between", value1, value2, "administrationTrueName");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentIsNull() {
            addCriterion("administration_department is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentIsNotNull() {
            addCriterion("administration_department is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentEqualTo(String value) {
            addCriterion("administration_department =", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentNotEqualTo(String value) {
            addCriterion("administration_department <>", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentGreaterThan(String value) {
            addCriterion("administration_department >", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("administration_department >=", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentLessThan(String value) {
            addCriterion("administration_department <", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentLessThanOrEqualTo(String value) {
            addCriterion("administration_department <=", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentLike(String value) {
            addCriterion("administration_department like", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentNotLike(String value) {
            addCriterion("administration_department not like", value, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentIn(List<String> values) {
            addCriterion("administration_department in", values, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentNotIn(List<String> values) {
            addCriterion("administration_department not in", values, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentBetween(String value1, String value2) {
            addCriterion("administration_department between", value1, value2, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationDepartmentNotBetween(String value1, String value2) {
            addCriterion("administration_department not between", value1, value2, "administrationDepartment");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexIsNull() {
            addCriterion("administration_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexIsNotNull() {
            addCriterion("administration_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexEqualTo(Integer value) {
            addCriterion("administration_sex =", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexNotEqualTo(Integer value) {
            addCriterion("administration_sex <>", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexGreaterThan(Integer value) {
            addCriterion("administration_sex >", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("administration_sex >=", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexLessThan(Integer value) {
            addCriterion("administration_sex <", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexLessThanOrEqualTo(Integer value) {
            addCriterion("administration_sex <=", value, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexIn(List<Integer> values) {
            addCriterion("administration_sex in", values, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexNotIn(List<Integer> values) {
            addCriterion("administration_sex not in", values, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexBetween(Integer value1, Integer value2) {
            addCriterion("administration_sex between", value1, value2, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationSexNotBetween(Integer value1, Integer value2) {
            addCriterion("administration_sex not between", value1, value2, "administrationSex");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailIsNull() {
            addCriterion("administration_email is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailIsNotNull() {
            addCriterion("administration_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailEqualTo(String value) {
            addCriterion("administration_email =", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailNotEqualTo(String value) {
            addCriterion("administration_email <>", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailGreaterThan(String value) {
            addCriterion("administration_email >", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailGreaterThanOrEqualTo(String value) {
            addCriterion("administration_email >=", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailLessThan(String value) {
            addCriterion("administration_email <", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailLessThanOrEqualTo(String value) {
            addCriterion("administration_email <=", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailLike(String value) {
            addCriterion("administration_email like", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailNotLike(String value) {
            addCriterion("administration_email not like", value, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailIn(List<String> values) {
            addCriterion("administration_email in", values, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailNotIn(List<String> values) {
            addCriterion("administration_email not in", values, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailBetween(String value1, String value2) {
            addCriterion("administration_email between", value1, value2, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationEmailNotBetween(String value1, String value2) {
            addCriterion("administration_email not between", value1, value2, "administrationEmail");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneIsNull() {
            addCriterion("administration_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneIsNotNull() {
            addCriterion("administration_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneEqualTo(String value) {
            addCriterion("administration_phone =", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneNotEqualTo(String value) {
            addCriterion("administration_phone <>", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneGreaterThan(String value) {
            addCriterion("administration_phone >", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("administration_phone >=", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneLessThan(String value) {
            addCriterion("administration_phone <", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneLessThanOrEqualTo(String value) {
            addCriterion("administration_phone <=", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneLike(String value) {
            addCriterion("administration_phone like", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneNotLike(String value) {
            addCriterion("administration_phone not like", value, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneIn(List<String> values) {
            addCriterion("administration_phone in", values, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneNotIn(List<String> values) {
            addCriterion("administration_phone not in", values, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneBetween(String value1, String value2) {
            addCriterion("administration_phone between", value1, value2, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationPhoneNotBetween(String value1, String value2) {
            addCriterion("administration_phone not between", value1, value2, "administrationPhone");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressIsNull() {
            addCriterion("administration_address is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressIsNotNull() {
            addCriterion("administration_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressEqualTo(String value) {
            addCriterion("administration_address =", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressNotEqualTo(String value) {
            addCriterion("administration_address <>", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressGreaterThan(String value) {
            addCriterion("administration_address >", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("administration_address >=", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressLessThan(String value) {
            addCriterion("administration_address <", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressLessThanOrEqualTo(String value) {
            addCriterion("administration_address <=", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressLike(String value) {
            addCriterion("administration_address like", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressNotLike(String value) {
            addCriterion("administration_address not like", value, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressIn(List<String> values) {
            addCriterion("administration_address in", values, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressNotIn(List<String> values) {
            addCriterion("administration_address not in", values, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressBetween(String value1, String value2) {
            addCriterion("administration_address between", value1, value2, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationAddressNotBetween(String value1, String value2) {
            addCriterion("administration_address not between", value1, value2, "administrationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeIsNull() {
            addCriterion("administration_grade is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeIsNotNull() {
            addCriterion("administration_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeEqualTo(Integer value) {
            addCriterion("administration_grade =", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeNotEqualTo(Integer value) {
            addCriterion("administration_grade <>", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeGreaterThan(Integer value) {
            addCriterion("administration_grade >", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("administration_grade >=", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeLessThan(Integer value) {
            addCriterion("administration_grade <", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeLessThanOrEqualTo(Integer value) {
            addCriterion("administration_grade <=", value, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeIn(List<Integer> values) {
            addCriterion("administration_grade in", values, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeNotIn(List<Integer> values) {
            addCriterion("administration_grade not in", values, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeBetween(Integer value1, Integer value2) {
            addCriterion("administration_grade between", value1, value2, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("administration_grade not between", value1, value2, "administrationGrade");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateIsNull() {
            addCriterion("administration_state is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateIsNotNull() {
            addCriterion("administration_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateEqualTo(Integer value) {
            addCriterion("administration_state =", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateNotEqualTo(Integer value) {
            addCriterion("administration_state <>", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateGreaterThan(Integer value) {
            addCriterion("administration_state >", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("administration_state >=", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateLessThan(Integer value) {
            addCriterion("administration_state <", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateLessThanOrEqualTo(Integer value) {
            addCriterion("administration_state <=", value, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateIn(List<Integer> values) {
            addCriterion("administration_state in", values, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateNotIn(List<Integer> values) {
            addCriterion("administration_state not in", values, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateBetween(Integer value1, Integer value2) {
            addCriterion("administration_state between", value1, value2, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationStateNotBetween(Integer value1, Integer value2) {
            addCriterion("administration_state not between", value1, value2, "administrationState");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeIsNull() {
            addCriterion("administration_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeIsNotNull() {
            addCriterion("administration_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeEqualTo(Date value) {
            addCriterion("administration_createtime =", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeNotEqualTo(Date value) {
            addCriterion("administration_createtime <>", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeGreaterThan(Date value) {
            addCriterion("administration_createtime >", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("administration_createtime >=", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeLessThan(Date value) {
            addCriterion("administration_createtime <", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("administration_createtime <=", value, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeIn(List<Date> values) {
            addCriterion("administration_createtime in", values, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeNotIn(List<Date> values) {
            addCriterion("administration_createtime not in", values, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeBetween(Date value1, Date value2) {
            addCriterion("administration_createtime between", value1, value2, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("administration_createtime not between", value1, value2, "administrationCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterIsNull() {
            addCriterion("administration_createter is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterIsNotNull() {
            addCriterion("administration_createter is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterEqualTo(String value) {
            addCriterion("administration_createter =", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterNotEqualTo(String value) {
            addCriterion("administration_createter <>", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterGreaterThan(String value) {
            addCriterion("administration_createter >", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("administration_createter >=", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterLessThan(String value) {
            addCriterion("administration_createter <", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterLessThanOrEqualTo(String value) {
            addCriterion("administration_createter <=", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterLike(String value) {
            addCriterion("administration_createter like", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterNotLike(String value) {
            addCriterion("administration_createter not like", value, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterIn(List<String> values) {
            addCriterion("administration_createter in", values, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterNotIn(List<String> values) {
            addCriterion("administration_createter not in", values, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterBetween(String value1, String value2) {
            addCriterion("administration_createter between", value1, value2, "administrationCreateter");
            return (Criteria) this;
        }

        public Criteria andAdministrationCreateterNotBetween(String value1, String value2) {
            addCriterion("administration_createter not between", value1, value2, "administrationCreateter");
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