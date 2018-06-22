package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NursingTestingContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NursingTestingContentExample() {
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

        public Criteria andNursingTestingContentidIsNull() {
            addCriterion("nursing_testing_contentid is null");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidIsNotNull() {
            addCriterion("nursing_testing_contentid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidEqualTo(String value) {
            addCriterion("nursing_testing_contentid =", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidNotEqualTo(String value) {
            addCriterion("nursing_testing_contentid <>", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidGreaterThan(String value) {
            addCriterion("nursing_testing_contentid >", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_testing_contentid >=", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidLessThan(String value) {
            addCriterion("nursing_testing_contentid <", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidLessThanOrEqualTo(String value) {
            addCriterion("nursing_testing_contentid <=", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidLike(String value) {
            addCriterion("nursing_testing_contentid like", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidNotLike(String value) {
            addCriterion("nursing_testing_contentid not like", value, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidIn(List<String> values) {
            addCriterion("nursing_testing_contentid in", values, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidNotIn(List<String> values) {
            addCriterion("nursing_testing_contentid not in", values, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidBetween(String value1, String value2) {
            addCriterion("nursing_testing_contentid between", value1, value2, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingContentidNotBetween(String value1, String value2) {
            addCriterion("nursing_testing_contentid not between", value1, value2, "nursingTestingContentid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidIsNull() {
            addCriterion("nursing_orderid is null");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidIsNotNull() {
            addCriterion("nursing_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidEqualTo(String value) {
            addCriterion("nursing_orderid =", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidNotEqualTo(String value) {
            addCriterion("nursing_orderid <>", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidGreaterThan(String value) {
            addCriterion("nursing_orderid >", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_orderid >=", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidLessThan(String value) {
            addCriterion("nursing_orderid <", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidLessThanOrEqualTo(String value) {
            addCriterion("nursing_orderid <=", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidLike(String value) {
            addCriterion("nursing_orderid like", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidNotLike(String value) {
            addCriterion("nursing_orderid not like", value, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidIn(List<String> values) {
            addCriterion("nursing_orderid in", values, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidNotIn(List<String> values) {
            addCriterion("nursing_orderid not in", values, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidBetween(String value1, String value2) {
            addCriterion("nursing_orderid between", value1, value2, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingOrderidNotBetween(String value1, String value2) {
            addCriterion("nursing_orderid not between", value1, value2, "nursingOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIsNull() {
            addCriterion("nursing_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIsNotNull() {
            addCriterion("nursing_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidEqualTo(String value) {
            addCriterion("nursing_nurseid =", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotEqualTo(String value) {
            addCriterion("nursing_nurseid <>", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidGreaterThan(String value) {
            addCriterion("nursing_nurseid >", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_nurseid >=", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLessThan(String value) {
            addCriterion("nursing_nurseid <", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLessThanOrEqualTo(String value) {
            addCriterion("nursing_nurseid <=", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLike(String value) {
            addCriterion("nursing_nurseid like", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotLike(String value) {
            addCriterion("nursing_nurseid not like", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIn(List<String> values) {
            addCriterion("nursing_nurseid in", values, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotIn(List<String> values) {
            addCriterion("nursing_nurseid not in", values, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidBetween(String value1, String value2) {
            addCriterion("nursing_nurseid between", value1, value2, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotBetween(String value1, String value2) {
            addCriterion("nursing_nurseid not between", value1, value2, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdIsNull() {
            addCriterion("nursing_testing_id is null");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdIsNotNull() {
            addCriterion("nursing_testing_id is not null");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdEqualTo(String value) {
            addCriterion("nursing_testing_id =", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdNotEqualTo(String value) {
            addCriterion("nursing_testing_id <>", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdGreaterThan(String value) {
            addCriterion("nursing_testing_id >", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_testing_id >=", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdLessThan(String value) {
            addCriterion("nursing_testing_id <", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdLessThanOrEqualTo(String value) {
            addCriterion("nursing_testing_id <=", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdLike(String value) {
            addCriterion("nursing_testing_id like", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdNotLike(String value) {
            addCriterion("nursing_testing_id not like", value, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdIn(List<String> values) {
            addCriterion("nursing_testing_id in", values, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdNotIn(List<String> values) {
            addCriterion("nursing_testing_id not in", values, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdBetween(String value1, String value2) {
            addCriterion("nursing_testing_id between", value1, value2, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingTestingIdNotBetween(String value1, String value2) {
            addCriterion("nursing_testing_id not between", value1, value2, "nursingTestingId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIsNull() {
            addCriterion("nursing_project_note is null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIsNotNull() {
            addCriterion("nursing_project_note is not null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteEqualTo(String value) {
            addCriterion("nursing_project_note =", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotEqualTo(String value) {
            addCriterion("nursing_project_note <>", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteGreaterThan(String value) {
            addCriterion("nursing_project_note >", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_project_note >=", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLessThan(String value) {
            addCriterion("nursing_project_note <", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLessThanOrEqualTo(String value) {
            addCriterion("nursing_project_note <=", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLike(String value) {
            addCriterion("nursing_project_note like", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotLike(String value) {
            addCriterion("nursing_project_note not like", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIn(List<String> values) {
            addCriterion("nursing_project_note in", values, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotIn(List<String> values) {
            addCriterion("nursing_project_note not in", values, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteBetween(String value1, String value2) {
            addCriterion("nursing_project_note between", value1, value2, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotBetween(String value1, String value2) {
            addCriterion("nursing_project_note not between", value1, value2, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeIsNull() {
            addCriterion("nursing_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeIsNotNull() {
            addCriterion("nursing_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeEqualTo(Date value) {
            addCriterion("nursing_createtime =", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeNotEqualTo(Date value) {
            addCriterion("nursing_createtime <>", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeGreaterThan(Date value) {
            addCriterion("nursing_createtime >", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nursing_createtime >=", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeLessThan(Date value) {
            addCriterion("nursing_createtime <", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nursing_createtime <=", value, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeIn(List<Date> values) {
            addCriterion("nursing_createtime in", values, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeNotIn(List<Date> values) {
            addCriterion("nursing_createtime not in", values, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nursing_createtime between", value1, value2, "nursingCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nursing_createtime not between", value1, value2, "nursingCreatetime");
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