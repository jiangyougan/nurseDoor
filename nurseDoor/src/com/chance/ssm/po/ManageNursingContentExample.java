package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageNursingContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageNursingContentExample() {
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

        public Criteria andManageNursingContentIdIsNull() {
            addCriterion("manage_nursing_content_id is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdIsNotNull() {
            addCriterion("manage_nursing_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdEqualTo(String value) {
            addCriterion("manage_nursing_content_id =", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdNotEqualTo(String value) {
            addCriterion("manage_nursing_content_id <>", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdGreaterThan(String value) {
            addCriterion("manage_nursing_content_id >", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_id >=", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdLessThan(String value) {
            addCriterion("manage_nursing_content_id <", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_id <=", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdLike(String value) {
            addCriterion("manage_nursing_content_id like", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdNotLike(String value) {
            addCriterion("manage_nursing_content_id not like", value, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdIn(List<String> values) {
            addCriterion("manage_nursing_content_id in", values, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdNotIn(List<String> values) {
            addCriterion("manage_nursing_content_id not in", values, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_id between", value1, value2, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentIdNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_id not between", value1, value2, "manageNursingContentId");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectIsNull() {
            addCriterion("manage_nursing_content_maproject is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectIsNotNull() {
            addCriterion("manage_nursing_content_maproject is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectEqualTo(String value) {
            addCriterion("manage_nursing_content_maproject =", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectNotEqualTo(String value) {
            addCriterion("manage_nursing_content_maproject <>", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectGreaterThan(String value) {
            addCriterion("manage_nursing_content_maproject >", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_maproject >=", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectLessThan(String value) {
            addCriterion("manage_nursing_content_maproject <", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_maproject <=", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectLike(String value) {
            addCriterion("manage_nursing_content_maproject like", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectNotLike(String value) {
            addCriterion("manage_nursing_content_maproject not like", value, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectIn(List<String> values) {
            addCriterion("manage_nursing_content_maproject in", values, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectNotIn(List<String> values) {
            addCriterion("manage_nursing_content_maproject not in", values, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_maproject between", value1, value2, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMaprojectNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_maproject not between", value1, value2, "manageNursingContentMaproject");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorIsNull() {
            addCriterion("manage_nursing_content_major is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorIsNotNull() {
            addCriterion("manage_nursing_content_major is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorEqualTo(String value) {
            addCriterion("manage_nursing_content_major =", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorNotEqualTo(String value) {
            addCriterion("manage_nursing_content_major <>", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorGreaterThan(String value) {
            addCriterion("manage_nursing_content_major >", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_major >=", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorLessThan(String value) {
            addCriterion("manage_nursing_content_major <", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_major <=", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorLike(String value) {
            addCriterion("manage_nursing_content_major like", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorNotLike(String value) {
            addCriterion("manage_nursing_content_major not like", value, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorIn(List<String> values) {
            addCriterion("manage_nursing_content_major in", values, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorNotIn(List<String> values) {
            addCriterion("manage_nursing_content_major not in", values, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_major between", value1, value2, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentMajorNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_major not between", value1, value2, "manageNursingContentMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameIsNull() {
            addCriterion("manage_nursing_content_name is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameIsNotNull() {
            addCriterion("manage_nursing_content_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameEqualTo(String value) {
            addCriterion("manage_nursing_content_name =", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameNotEqualTo(String value) {
            addCriterion("manage_nursing_content_name <>", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameGreaterThan(String value) {
            addCriterion("manage_nursing_content_name >", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_name >=", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameLessThan(String value) {
            addCriterion("manage_nursing_content_name <", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_name <=", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameLike(String value) {
            addCriterion("manage_nursing_content_name like", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameNotLike(String value) {
            addCriterion("manage_nursing_content_name not like", value, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameIn(List<String> values) {
            addCriterion("manage_nursing_content_name in", values, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameNotIn(List<String> values) {
            addCriterion("manage_nursing_content_name not in", values, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_name between", value1, value2, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentNameNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_name not between", value1, value2, "manageNursingContentName");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentIsNull() {
            addCriterion("manage_nursing_content_content is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentIsNotNull() {
            addCriterion("manage_nursing_content_content is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentEqualTo(String value) {
            addCriterion("manage_nursing_content_content =", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentNotEqualTo(String value) {
            addCriterion("manage_nursing_content_content <>", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentGreaterThan(String value) {
            addCriterion("manage_nursing_content_content >", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_content >=", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentLessThan(String value) {
            addCriterion("manage_nursing_content_content <", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_content <=", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentLike(String value) {
            addCriterion("manage_nursing_content_content like", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentNotLike(String value) {
            addCriterion("manage_nursing_content_content not like", value, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentIn(List<String> values) {
            addCriterion("manage_nursing_content_content in", values, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentNotIn(List<String> values) {
            addCriterion("manage_nursing_content_content not in", values, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_content between", value1, value2, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentContentNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_content not between", value1, value2, "manageNursingContentContent");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostIsNull() {
            addCriterion("manage_nursing_content_cost is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostIsNotNull() {
            addCriterion("manage_nursing_content_cost is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_cost =", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostNotEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_cost <>", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostGreaterThan(BigDecimal value) {
            addCriterion("manage_nursing_content_cost >", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_cost >=", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostLessThan(BigDecimal value) {
            addCriterion("manage_nursing_content_cost <", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_cost <=", value, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostIn(List<BigDecimal> values) {
            addCriterion("manage_nursing_content_cost in", values, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostNotIn(List<BigDecimal> values) {
            addCriterion("manage_nursing_content_cost not in", values, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_nursing_content_cost between", value1, value2, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_nursing_content_cost not between", value1, value2, "manageNursingContentCost");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesIsNull() {
            addCriterion("manage_nursing_content_supplies is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesIsNotNull() {
            addCriterion("manage_nursing_content_supplies is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies =", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesNotEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies <>", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesGreaterThan(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies >", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies >=", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesLessThan(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies <", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_nursing_content_supplies <=", value, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesIn(List<BigDecimal> values) {
            addCriterion("manage_nursing_content_supplies in", values, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesNotIn(List<BigDecimal> values) {
            addCriterion("manage_nursing_content_supplies not in", values, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_nursing_content_supplies between", value1, value2, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentSuppliesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_nursing_content_supplies not between", value1, value2, "manageNursingContentSupplies");
            return (Criteria) this;
        }

        public Criteria andContentImgurlIsNull() {
            addCriterion("content_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andContentImgurlIsNotNull() {
            addCriterion("content_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andContentImgurlEqualTo(String value) {
            addCriterion("content_imgurl =", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlNotEqualTo(String value) {
            addCriterion("content_imgurl <>", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlGreaterThan(String value) {
            addCriterion("content_imgurl >", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("content_imgurl >=", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlLessThan(String value) {
            addCriterion("content_imgurl <", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlLessThanOrEqualTo(String value) {
            addCriterion("content_imgurl <=", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlLike(String value) {
            addCriterion("content_imgurl like", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlNotLike(String value) {
            addCriterion("content_imgurl not like", value, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlIn(List<String> values) {
            addCriterion("content_imgurl in", values, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlNotIn(List<String> values) {
            addCriterion("content_imgurl not in", values, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlBetween(String value1, String value2) {
            addCriterion("content_imgurl between", value1, value2, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentImgurlNotBetween(String value1, String value2) {
            addCriterion("content_imgurl not between", value1, value2, "contentImgurl");
            return (Criteria) this;
        }

        public Criteria andContentRequiredIsNull() {
            addCriterion("content_required is null");
            return (Criteria) this;
        }

        public Criteria andContentRequiredIsNotNull() {
            addCriterion("content_required is not null");
            return (Criteria) this;
        }

        public Criteria andContentRequiredEqualTo(Integer value) {
            addCriterion("content_required =", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredNotEqualTo(Integer value) {
            addCriterion("content_required <>", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredGreaterThan(Integer value) {
            addCriterion("content_required >", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_required >=", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredLessThan(Integer value) {
            addCriterion("content_required <", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredLessThanOrEqualTo(Integer value) {
            addCriterion("content_required <=", value, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredIn(List<Integer> values) {
            addCriterion("content_required in", values, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredNotIn(List<Integer> values) {
            addCriterion("content_required not in", values, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredBetween(Integer value1, Integer value2) {
            addCriterion("content_required between", value1, value2, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentRequiredNotBetween(Integer value1, Integer value2) {
            addCriterion("content_required not between", value1, value2, "contentRequired");
            return (Criteria) this;
        }

        public Criteria andContentNoteIsNull() {
            addCriterion("content_note is null");
            return (Criteria) this;
        }

        public Criteria andContentNoteIsNotNull() {
            addCriterion("content_note is not null");
            return (Criteria) this;
        }

        public Criteria andContentNoteEqualTo(String value) {
            addCriterion("content_note =", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteNotEqualTo(String value) {
            addCriterion("content_note <>", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteGreaterThan(String value) {
            addCriterion("content_note >", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteGreaterThanOrEqualTo(String value) {
            addCriterion("content_note >=", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteLessThan(String value) {
            addCriterion("content_note <", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteLessThanOrEqualTo(String value) {
            addCriterion("content_note <=", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteLike(String value) {
            addCriterion("content_note like", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteNotLike(String value) {
            addCriterion("content_note not like", value, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteIn(List<String> values) {
            addCriterion("content_note in", values, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteNotIn(List<String> values) {
            addCriterion("content_note not in", values, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteBetween(String value1, String value2) {
            addCriterion("content_note between", value1, value2, "contentNote");
            return (Criteria) this;
        }

        public Criteria andContentNoteNotBetween(String value1, String value2) {
            addCriterion("content_note not between", value1, value2, "contentNote");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterIsNull() {
            addCriterion("manage_nursing_content_createter is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterIsNotNull() {
            addCriterion("manage_nursing_content_createter is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterEqualTo(String value) {
            addCriterion("manage_nursing_content_createter =", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterNotEqualTo(String value) {
            addCriterion("manage_nursing_content_createter <>", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterGreaterThan(String value) {
            addCriterion("manage_nursing_content_createter >", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_createter >=", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterLessThan(String value) {
            addCriterion("manage_nursing_content_createter <", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_content_createter <=", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterLike(String value) {
            addCriterion("manage_nursing_content_createter like", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterNotLike(String value) {
            addCriterion("manage_nursing_content_createter not like", value, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterIn(List<String> values) {
            addCriterion("manage_nursing_content_createter in", values, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterNotIn(List<String> values) {
            addCriterion("manage_nursing_content_createter not in", values, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_createter between", value1, value2, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreateterNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_content_createter not between", value1, value2, "manageNursingContentCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeIsNull() {
            addCriterion("manage_nursing_content_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeIsNotNull() {
            addCriterion("manage_nursing_content_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_content_createtime =", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_content_createtime <>", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_content_createtime >", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_content_createtime >=", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeLessThan(Date value) {
            addCriterion("manage_nursing_content_createtime <", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_content_createtime <=", value, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_content_createtime in", values, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_content_createtime not in", values, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_content_createtime between", value1, value2, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_content_createtime not between", value1, value2, "manageNursingContentCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeIsNull() {
            addCriterion("manage_nursing_content_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeIsNotNull() {
            addCriterion("manage_nursing_content_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_content_updatetime =", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_content_updatetime <>", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_content_updatetime >", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_content_updatetime >=", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeLessThan(Date value) {
            addCriterion("manage_nursing_content_updatetime <", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_content_updatetime <=", value, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_content_updatetime in", values, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_content_updatetime not in", values, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_content_updatetime between", value1, value2, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingContentUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_content_updatetime not between", value1, value2, "manageNursingContentUpdatetime");
            return (Criteria) this;
        }

        public Criteria andContentOrderIsNull() {
            addCriterion("content_order is null");
            return (Criteria) this;
        }

        public Criteria andContentOrderIsNotNull() {
            addCriterion("content_order is not null");
            return (Criteria) this;
        }

        public Criteria andContentOrderEqualTo(Integer value) {
            addCriterion("content_order =", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderNotEqualTo(Integer value) {
            addCriterion("content_order <>", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderGreaterThan(Integer value) {
            addCriterion("content_order >", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_order >=", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderLessThan(Integer value) {
            addCriterion("content_order <", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderLessThanOrEqualTo(Integer value) {
            addCriterion("content_order <=", value, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderIn(List<Integer> values) {
            addCriterion("content_order in", values, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderNotIn(List<Integer> values) {
            addCriterion("content_order not in", values, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderBetween(Integer value1, Integer value2) {
            addCriterion("content_order between", value1, value2, "contentOrder");
            return (Criteria) this;
        }

        public Criteria andContentOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("content_order not between", value1, value2, "contentOrder");
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