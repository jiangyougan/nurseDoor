package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageNursingProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageNursingProjectExample() {
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

        public Criteria andManageNursingProjectIdIsNull() {
            addCriterion("manage_nursing_project_id is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdIsNotNull() {
            addCriterion("manage_nursing_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdEqualTo(String value) {
            addCriterion("manage_nursing_project_id =", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdNotEqualTo(String value) {
            addCriterion("manage_nursing_project_id <>", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdGreaterThan(String value) {
            addCriterion("manage_nursing_project_id >", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_id >=", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdLessThan(String value) {
            addCriterion("manage_nursing_project_id <", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_id <=", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdLike(String value) {
            addCriterion("manage_nursing_project_id like", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdNotLike(String value) {
            addCriterion("manage_nursing_project_id not like", value, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdIn(List<String> values) {
            addCriterion("manage_nursing_project_id in", values, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdNotIn(List<String> values) {
            addCriterion("manage_nursing_project_id not in", values, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_id between", value1, value2, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectIdNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_id not between", value1, value2, "manageNursingProjectId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicIsNull() {
            addCriterion("manage_nursing_project_pic is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicIsNotNull() {
            addCriterion("manage_nursing_project_pic is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicEqualTo(String value) {
            addCriterion("manage_nursing_project_pic =", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicNotEqualTo(String value) {
            addCriterion("manage_nursing_project_pic <>", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicGreaterThan(String value) {
            addCriterion("manage_nursing_project_pic >", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_pic >=", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicLessThan(String value) {
            addCriterion("manage_nursing_project_pic <", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_pic <=", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicLike(String value) {
            addCriterion("manage_nursing_project_pic like", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicNotLike(String value) {
            addCriterion("manage_nursing_project_pic not like", value, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicIn(List<String> values) {
            addCriterion("manage_nursing_project_pic in", values, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicNotIn(List<String> values) {
            addCriterion("manage_nursing_project_pic not in", values, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_pic between", value1, value2, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectPicNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_pic not between", value1, value2, "manageNursingProjectPic");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdIsNull() {
            addCriterion("manage_nursing_project_name_id is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdIsNotNull() {
            addCriterion("manage_nursing_project_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdEqualTo(String value) {
            addCriterion("manage_nursing_project_name_id =", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdNotEqualTo(String value) {
            addCriterion("manage_nursing_project_name_id <>", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdGreaterThan(String value) {
            addCriterion("manage_nursing_project_name_id >", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_name_id >=", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdLessThan(String value) {
            addCriterion("manage_nursing_project_name_id <", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_name_id <=", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdLike(String value) {
            addCriterion("manage_nursing_project_name_id like", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdNotLike(String value) {
            addCriterion("manage_nursing_project_name_id not like", value, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdIn(List<String> values) {
            addCriterion("manage_nursing_project_name_id in", values, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdNotIn(List<String> values) {
            addCriterion("manage_nursing_project_name_id not in", values, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_name_id between", value1, value2, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectNameIdNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_name_id not between", value1, value2, "manageNursingProjectNameId");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorIsNull() {
            addCriterion("manage_nursing_project_major is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorIsNotNull() {
            addCriterion("manage_nursing_project_major is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorEqualTo(String value) {
            addCriterion("manage_nursing_project_major =", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorNotEqualTo(String value) {
            addCriterion("manage_nursing_project_major <>", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorGreaterThan(String value) {
            addCriterion("manage_nursing_project_major >", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_major >=", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorLessThan(String value) {
            addCriterion("manage_nursing_project_major <", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_major <=", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorLike(String value) {
            addCriterion("manage_nursing_project_major like", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorNotLike(String value) {
            addCriterion("manage_nursing_project_major not like", value, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorIn(List<String> values) {
            addCriterion("manage_nursing_project_major in", values, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorNotIn(List<String> values) {
            addCriterion("manage_nursing_project_major not in", values, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_major between", value1, value2, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectMajorNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_major not between", value1, value2, "manageNursingProjectMajor");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlIsNull() {
            addCriterion("project_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlIsNotNull() {
            addCriterion("project_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlEqualTo(String value) {
            addCriterion("project_imgurl =", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlNotEqualTo(String value) {
            addCriterion("project_imgurl <>", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlGreaterThan(String value) {
            addCriterion("project_imgurl >", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("project_imgurl >=", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlLessThan(String value) {
            addCriterion("project_imgurl <", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlLessThanOrEqualTo(String value) {
            addCriterion("project_imgurl <=", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlLike(String value) {
            addCriterion("project_imgurl like", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlNotLike(String value) {
            addCriterion("project_imgurl not like", value, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlIn(List<String> values) {
            addCriterion("project_imgurl in", values, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlNotIn(List<String> values) {
            addCriterion("project_imgurl not in", values, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlBetween(String value1, String value2) {
            addCriterion("project_imgurl between", value1, value2, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andProjectImgurlNotBetween(String value1, String value2) {
            addCriterion("project_imgurl not between", value1, value2, "projectImgurl");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterIsNull() {
            addCriterion("manage_nursing_project_createter is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterIsNotNull() {
            addCriterion("manage_nursing_project_createter is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterEqualTo(String value) {
            addCriterion("manage_nursing_project_createter =", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterNotEqualTo(String value) {
            addCriterion("manage_nursing_project_createter <>", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterGreaterThan(String value) {
            addCriterion("manage_nursing_project_createter >", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_createter >=", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterLessThan(String value) {
            addCriterion("manage_nursing_project_createter <", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_project_createter <=", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterLike(String value) {
            addCriterion("manage_nursing_project_createter like", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterNotLike(String value) {
            addCriterion("manage_nursing_project_createter not like", value, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterIn(List<String> values) {
            addCriterion("manage_nursing_project_createter in", values, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterNotIn(List<String> values) {
            addCriterion("manage_nursing_project_createter not in", values, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_createter between", value1, value2, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreateterNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_project_createter not between", value1, value2, "manageNursingProjectCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeIsNull() {
            addCriterion("manage_nursing_project_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeIsNotNull() {
            addCriterion("manage_nursing_project_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_project_createtime =", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_project_createtime <>", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_project_createtime >", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_project_createtime >=", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeLessThan(Date value) {
            addCriterion("manage_nursing_project_createtime <", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_project_createtime <=", value, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_project_createtime in", values, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_project_createtime not in", values, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_project_createtime between", value1, value2, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_project_createtime not between", value1, value2, "manageNursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeIsNull() {
            addCriterion("manage_nursing_project_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeIsNotNull() {
            addCriterion("manage_nursing_project_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_project_updatetime =", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_project_updatetime <>", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_project_updatetime >", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_project_updatetime >=", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeLessThan(Date value) {
            addCriterion("manage_nursing_project_updatetime <", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_project_updatetime <=", value, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_project_updatetime in", values, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_project_updatetime not in", values, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_project_updatetime between", value1, value2, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingProjectUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_project_updatetime not between", value1, value2, "manageNursingProjectUpdatetime");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIsNull() {
            addCriterion("project_order is null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIsNotNull() {
            addCriterion("project_order is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOrderEqualTo(Integer value) {
            addCriterion("project_order =", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNotEqualTo(Integer value) {
            addCriterion("project_order <>", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderGreaterThan(Integer value) {
            addCriterion("project_order >", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_order >=", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLessThan(Integer value) {
            addCriterion("project_order <", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderLessThanOrEqualTo(Integer value) {
            addCriterion("project_order <=", value, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderIn(List<Integer> values) {
            addCriterion("project_order in", values, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNotIn(List<Integer> values) {
            addCriterion("project_order not in", values, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderBetween(Integer value1, Integer value2) {
            addCriterion("project_order between", value1, value2, "projectOrder");
            return (Criteria) this;
        }

        public Criteria andProjectOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("project_order not between", value1, value2, "projectOrder");
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