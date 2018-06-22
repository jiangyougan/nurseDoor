package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ProtectedPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProtectedPersonExample() {
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

        public Criteria andProtectedPersonIdIsNull() {
            addCriterion("protected_person_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdIsNotNull() {
            addCriterion("protected_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdEqualTo(String value) {
            addCriterion("protected_person_id =", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdNotEqualTo(String value) {
            addCriterion("protected_person_id <>", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdGreaterThan(String value) {
            addCriterion("protected_person_id >", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_id >=", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdLessThan(String value) {
            addCriterion("protected_person_id <", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdLessThanOrEqualTo(String value) {
            addCriterion("protected_person_id <=", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdLike(String value) {
            addCriterion("protected_person_id like", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdNotLike(String value) {
            addCriterion("protected_person_id not like", value, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdIn(List<String> values) {
            addCriterion("protected_person_id in", values, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdNotIn(List<String> values) {
            addCriterion("protected_person_id not in", values, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdBetween(String value1, String value2) {
            addCriterion("protected_person_id between", value1, value2, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonIdNotBetween(String value1, String value2) {
            addCriterion("protected_person_id not between", value1, value2, "protectedPersonId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameIsNull() {
            addCriterion("protected_person_name is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameIsNotNull() {
            addCriterion("protected_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameEqualTo(String value) {
            addCriterion("protected_person_name =", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameNotEqualTo(String value) {
            addCriterion("protected_person_name <>", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameGreaterThan(String value) {
            addCriterion("protected_person_name >", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_name >=", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameLessThan(String value) {
            addCriterion("protected_person_name <", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameLessThanOrEqualTo(String value) {
            addCriterion("protected_person_name <=", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameLike(String value) {
            addCriterion("protected_person_name like", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameNotLike(String value) {
            addCriterion("protected_person_name not like", value, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameIn(List<String> values) {
            addCriterion("protected_person_name in", values, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameNotIn(List<String> values) {
            addCriterion("protected_person_name not in", values, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameBetween(String value1, String value2) {
            addCriterion("protected_person_name between", value1, value2, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNameNotBetween(String value1, String value2) {
            addCriterion("protected_person_name not between", value1, value2, "protectedPersonName");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexIsNull() {
            addCriterion("protected_person_sex is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexIsNotNull() {
            addCriterion("protected_person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexEqualTo(String value) {
            addCriterion("protected_person_sex =", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexNotEqualTo(String value) {
            addCriterion("protected_person_sex <>", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexGreaterThan(String value) {
            addCriterion("protected_person_sex >", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_sex >=", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexLessThan(String value) {
            addCriterion("protected_person_sex <", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexLessThanOrEqualTo(String value) {
            addCriterion("protected_person_sex <=", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexLike(String value) {
            addCriterion("protected_person_sex like", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexNotLike(String value) {
            addCriterion("protected_person_sex not like", value, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexIn(List<String> values) {
            addCriterion("protected_person_sex in", values, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexNotIn(List<String> values) {
            addCriterion("protected_person_sex not in", values, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexBetween(String value1, String value2) {
            addCriterion("protected_person_sex between", value1, value2, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonSexNotBetween(String value1, String value2) {
            addCriterion("protected_person_sex not between", value1, value2, "protectedPersonSex");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardIsNull() {
            addCriterion("protected_person_card is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardIsNotNull() {
            addCriterion("protected_person_card is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardEqualTo(String value) {
            addCriterion("protected_person_card =", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardNotEqualTo(String value) {
            addCriterion("protected_person_card <>", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardGreaterThan(String value) {
            addCriterion("protected_person_card >", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_card >=", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardLessThan(String value) {
            addCriterion("protected_person_card <", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardLessThanOrEqualTo(String value) {
            addCriterion("protected_person_card <=", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardLike(String value) {
            addCriterion("protected_person_card like", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardNotLike(String value) {
            addCriterion("protected_person_card not like", value, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardIn(List<String> values) {
            addCriterion("protected_person_card in", values, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardNotIn(List<String> values) {
            addCriterion("protected_person_card not in", values, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardBetween(String value1, String value2) {
            addCriterion("protected_person_card between", value1, value2, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonCardNotBetween(String value1, String value2) {
            addCriterion("protected_person_card not between", value1, value2, "protectedPersonCard");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeIsNull() {
            addCriterion("protected_person_age is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeIsNotNull() {
            addCriterion("protected_person_age is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeEqualTo(String value) {
            addCriterion("protected_person_age =", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeNotEqualTo(String value) {
            addCriterion("protected_person_age <>", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeGreaterThan(String value) {
            addCriterion("protected_person_age >", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_age >=", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeLessThan(String value) {
            addCriterion("protected_person_age <", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeLessThanOrEqualTo(String value) {
            addCriterion("protected_person_age <=", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeLike(String value) {
            addCriterion("protected_person_age like", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeNotLike(String value) {
            addCriterion("protected_person_age not like", value, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeIn(List<String> values) {
            addCriterion("protected_person_age in", values, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeNotIn(List<String> values) {
            addCriterion("protected_person_age not in", values, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeBetween(String value1, String value2) {
            addCriterion("protected_person_age between", value1, value2, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonAgeNotBetween(String value1, String value2) {
            addCriterion("protected_person_age not between", value1, value2, "protectedPersonAge");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightIsNull() {
            addCriterion("protected_person_height is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightIsNotNull() {
            addCriterion("protected_person_height is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightEqualTo(Double value) {
            addCriterion("protected_person_height =", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightNotEqualTo(Double value) {
            addCriterion("protected_person_height <>", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightGreaterThan(Double value) {
            addCriterion("protected_person_height >", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("protected_person_height >=", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightLessThan(Double value) {
            addCriterion("protected_person_height <", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightLessThanOrEqualTo(Double value) {
            addCriterion("protected_person_height <=", value, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightIn(List<Double> values) {
            addCriterion("protected_person_height in", values, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightNotIn(List<Double> values) {
            addCriterion("protected_person_height not in", values, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightBetween(Double value1, Double value2) {
            addCriterion("protected_person_height between", value1, value2, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonHeightNotBetween(Double value1, Double value2) {
            addCriterion("protected_person_height not between", value1, value2, "protectedPersonHeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightIsNull() {
            addCriterion("protected_person_weight is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightIsNotNull() {
            addCriterion("protected_person_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightEqualTo(Double value) {
            addCriterion("protected_person_weight =", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightNotEqualTo(Double value) {
            addCriterion("protected_person_weight <>", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightGreaterThan(Double value) {
            addCriterion("protected_person_weight >", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("protected_person_weight >=", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightLessThan(Double value) {
            addCriterion("protected_person_weight <", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightLessThanOrEqualTo(Double value) {
            addCriterion("protected_person_weight <=", value, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightIn(List<Double> values) {
            addCriterion("protected_person_weight in", values, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightNotIn(List<Double> values) {
            addCriterion("protected_person_weight not in", values, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightBetween(Double value1, Double value2) {
            addCriterion("protected_person_weight between", value1, value2, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonWeightNotBetween(Double value1, Double value2) {
            addCriterion("protected_person_weight not between", value1, value2, "protectedPersonWeight");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianIsNull() {
            addCriterion("protected_person_guardian is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianIsNotNull() {
            addCriterion("protected_person_guardian is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianEqualTo(String value) {
            addCriterion("protected_person_guardian =", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianNotEqualTo(String value) {
            addCriterion("protected_person_guardian <>", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianGreaterThan(String value) {
            addCriterion("protected_person_guardian >", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_guardian >=", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianLessThan(String value) {
            addCriterion("protected_person_guardian <", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianLessThanOrEqualTo(String value) {
            addCriterion("protected_person_guardian <=", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianLike(String value) {
            addCriterion("protected_person_guardian like", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianNotLike(String value) {
            addCriterion("protected_person_guardian not like", value, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianIn(List<String> values) {
            addCriterion("protected_person_guardian in", values, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianNotIn(List<String> values) {
            addCriterion("protected_person_guardian not in", values, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianBetween(String value1, String value2) {
            addCriterion("protected_person_guardian between", value1, value2, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonGuardianNotBetween(String value1, String value2) {
            addCriterion("protected_person_guardian not between", value1, value2, "protectedPersonGuardian");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneIsNull() {
            addCriterion("protected_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneIsNotNull() {
            addCriterion("protected_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneEqualTo(String value) {
            addCriterion("protected_person_phone =", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneNotEqualTo(String value) {
            addCriterion("protected_person_phone <>", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneGreaterThan(String value) {
            addCriterion("protected_person_phone >", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_phone >=", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneLessThan(String value) {
            addCriterion("protected_person_phone <", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("protected_person_phone <=", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneLike(String value) {
            addCriterion("protected_person_phone like", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneNotLike(String value) {
            addCriterion("protected_person_phone not like", value, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneIn(List<String> values) {
            addCriterion("protected_person_phone in", values, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneNotIn(List<String> values) {
            addCriterion("protected_person_phone not in", values, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneBetween(String value1, String value2) {
            addCriterion("protected_person_phone between", value1, value2, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("protected_person_phone not between", value1, value2, "protectedPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusIsNull() {
            addCriterion("protected_person_nexus is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusIsNotNull() {
            addCriterion("protected_person_nexus is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusEqualTo(String value) {
            addCriterion("protected_person_nexus =", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusNotEqualTo(String value) {
            addCriterion("protected_person_nexus <>", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusGreaterThan(String value) {
            addCriterion("protected_person_nexus >", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_nexus >=", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusLessThan(String value) {
            addCriterion("protected_person_nexus <", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusLessThanOrEqualTo(String value) {
            addCriterion("protected_person_nexus <=", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusLike(String value) {
            addCriterion("protected_person_nexus like", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusNotLike(String value) {
            addCriterion("protected_person_nexus not like", value, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusIn(List<String> values) {
            addCriterion("protected_person_nexus in", values, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusNotIn(List<String> values) {
            addCriterion("protected_person_nexus not in", values, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusBetween(String value1, String value2) {
            addCriterion("protected_person_nexus between", value1, value2, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNexusNotBetween(String value1, String value2) {
            addCriterion("protected_person_nexus not between", value1, value2, "protectedPersonNexus");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdIsNull() {
            addCriterion("protected_address_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdIsNotNull() {
            addCriterion("protected_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdEqualTo(String value) {
            addCriterion("protected_address_id =", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotEqualTo(String value) {
            addCriterion("protected_address_id <>", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdGreaterThan(String value) {
            addCriterion("protected_address_id >", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("protected_address_id >=", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLessThan(String value) {
            addCriterion("protected_address_id <", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLessThanOrEqualTo(String value) {
            addCriterion("protected_address_id <=", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdLike(String value) {
            addCriterion("protected_address_id like", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotLike(String value) {
            addCriterion("protected_address_id not like", value, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdIn(List<String> values) {
            addCriterion("protected_address_id in", values, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotIn(List<String> values) {
            addCriterion("protected_address_id not in", values, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdBetween(String value1, String value2) {
            addCriterion("protected_address_id between", value1, value2, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIdNotBetween(String value1, String value2) {
            addCriterion("protected_address_id not between", value1, value2, "protectedAddressId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteIsNull() {
            addCriterion("protected_person_note is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteIsNotNull() {
            addCriterion("protected_person_note is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteEqualTo(String value) {
            addCriterion("protected_person_note =", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteNotEqualTo(String value) {
            addCriterion("protected_person_note <>", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteGreaterThan(String value) {
            addCriterion("protected_person_note >", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_note >=", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteLessThan(String value) {
            addCriterion("protected_person_note <", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteLessThanOrEqualTo(String value) {
            addCriterion("protected_person_note <=", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteLike(String value) {
            addCriterion("protected_person_note like", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteNotLike(String value) {
            addCriterion("protected_person_note not like", value, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteIn(List<String> values) {
            addCriterion("protected_person_note in", values, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteNotIn(List<String> values) {
            addCriterion("protected_person_note not in", values, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteBetween(String value1, String value2) {
            addCriterion("protected_person_note between", value1, value2, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonNoteNotBetween(String value1, String value2) {
            addCriterion("protected_person_note not between", value1, value2, "protectedPersonNote");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIsNull() {
            addCriterion("protected_address is null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIsNotNull() {
            addCriterion("protected_address is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressEqualTo(String value) {
            addCriterion("protected_address =", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressNotEqualTo(String value) {
            addCriterion("protected_address <>", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressGreaterThan(String value) {
            addCriterion("protected_address >", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("protected_address >=", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressLessThan(String value) {
            addCriterion("protected_address <", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressLessThanOrEqualTo(String value) {
            addCriterion("protected_address <=", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressLike(String value) {
            addCriterion("protected_address like", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressNotLike(String value) {
            addCriterion("protected_address not like", value, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressIn(List<String> values) {
            addCriterion("protected_address in", values, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressNotIn(List<String> values) {
            addCriterion("protected_address not in", values, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressBetween(String value1, String value2) {
            addCriterion("protected_address between", value1, value2, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedAddressNotBetween(String value1, String value2) {
            addCriterion("protected_address not between", value1, value2, "protectedAddress");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultIsNull() {
            addCriterion("protected_default is null");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultIsNotNull() {
            addCriterion("protected_default is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultEqualTo(Integer value) {
            addCriterion("protected_default =", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultNotEqualTo(Integer value) {
            addCriterion("protected_default <>", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultGreaterThan(Integer value) {
            addCriterion("protected_default >", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("protected_default >=", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultLessThan(Integer value) {
            addCriterion("protected_default <", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("protected_default <=", value, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultIn(List<Integer> values) {
            addCriterion("protected_default in", values, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultNotIn(List<Integer> values) {
            addCriterion("protected_default not in", values, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultBetween(Integer value1, Integer value2) {
            addCriterion("protected_default between", value1, value2, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("protected_default not between", value1, value2, "protectedDefault");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdIsNull() {
            addCriterion("protected_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdIsNotNull() {
            addCriterion("protected_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdEqualTo(String value) {
            addCriterion("protected_user_id =", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdNotEqualTo(String value) {
            addCriterion("protected_user_id <>", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdGreaterThan(String value) {
            addCriterion("protected_user_id >", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("protected_user_id >=", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdLessThan(String value) {
            addCriterion("protected_user_id <", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdLessThanOrEqualTo(String value) {
            addCriterion("protected_user_id <=", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdLike(String value) {
            addCriterion("protected_user_id like", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdNotLike(String value) {
            addCriterion("protected_user_id not like", value, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdIn(List<String> values) {
            addCriterion("protected_user_id in", values, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdNotIn(List<String> values) {
            addCriterion("protected_user_id not in", values, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdBetween(String value1, String value2) {
            addCriterion("protected_user_id between", value1, value2, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedUserIdNotBetween(String value1, String value2) {
            addCriterion("protected_user_id not between", value1, value2, "protectedUserId");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneIsNull() {
            addCriterion("protected_person_overone is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneIsNotNull() {
            addCriterion("protected_person_overone is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneEqualTo(String value) {
            addCriterion("protected_person_overone =", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneNotEqualTo(String value) {
            addCriterion("protected_person_overone <>", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneGreaterThan(String value) {
            addCriterion("protected_person_overone >", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_overone >=", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneLessThan(String value) {
            addCriterion("protected_person_overone <", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneLessThanOrEqualTo(String value) {
            addCriterion("protected_person_overone <=", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneLike(String value) {
            addCriterion("protected_person_overone like", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneNotLike(String value) {
            addCriterion("protected_person_overone not like", value, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneIn(List<String> values) {
            addCriterion("protected_person_overone in", values, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneNotIn(List<String> values) {
            addCriterion("protected_person_overone not in", values, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneBetween(String value1, String value2) {
            addCriterion("protected_person_overone between", value1, value2, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOveroneNotBetween(String value1, String value2) {
            addCriterion("protected_person_overone not between", value1, value2, "protectedPersonOverone");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoIsNull() {
            addCriterion("protected_person_overtwo is null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoIsNotNull() {
            addCriterion("protected_person_overtwo is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoEqualTo(String value) {
            addCriterion("protected_person_overtwo =", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoNotEqualTo(String value) {
            addCriterion("protected_person_overtwo <>", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoGreaterThan(String value) {
            addCriterion("protected_person_overtwo >", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoGreaterThanOrEqualTo(String value) {
            addCriterion("protected_person_overtwo >=", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoLessThan(String value) {
            addCriterion("protected_person_overtwo <", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoLessThanOrEqualTo(String value) {
            addCriterion("protected_person_overtwo <=", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoLike(String value) {
            addCriterion("protected_person_overtwo like", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoNotLike(String value) {
            addCriterion("protected_person_overtwo not like", value, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoIn(List<String> values) {
            addCriterion("protected_person_overtwo in", values, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoNotIn(List<String> values) {
            addCriterion("protected_person_overtwo not in", values, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoBetween(String value1, String value2) {
            addCriterion("protected_person_overtwo between", value1, value2, "protectedPersonOvertwo");
            return (Criteria) this;
        }

        public Criteria andProtectedPersonOvertwoNotBetween(String value1, String value2) {
            addCriterion("protected_person_overtwo not between", value1, value2, "protectedPersonOvertwo");
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