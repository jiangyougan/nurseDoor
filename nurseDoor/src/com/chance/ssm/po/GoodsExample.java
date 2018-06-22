package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsContentIsNull() {
            addCriterion("goods_content is null");
            return (Criteria) this;
        }

        public Criteria andGoodsContentIsNotNull() {
            addCriterion("goods_content is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsContentEqualTo(String value) {
            addCriterion("goods_content =", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentNotEqualTo(String value) {
            addCriterion("goods_content <>", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentGreaterThan(String value) {
            addCriterion("goods_content >", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentGreaterThanOrEqualTo(String value) {
            addCriterion("goods_content >=", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentLessThan(String value) {
            addCriterion("goods_content <", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentLessThanOrEqualTo(String value) {
            addCriterion("goods_content <=", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentLike(String value) {
            addCriterion("goods_content like", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentNotLike(String value) {
            addCriterion("goods_content not like", value, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentIn(List<String> values) {
            addCriterion("goods_content in", values, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentNotIn(List<String> values) {
            addCriterion("goods_content not in", values, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentBetween(String value1, String value2) {
            addCriterion("goods_content between", value1, value2, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsContentNotBetween(String value1, String value2) {
            addCriterion("goods_content not between", value1, value2, "goodsContent");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyIsNull() {
            addCriterion("goods_money is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyIsNotNull() {
            addCriterion("goods_money is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyEqualTo(BigDecimal value) {
            addCriterion("goods_money =", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("goods_money <>", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyGreaterThan(BigDecimal value) {
            addCriterion("goods_money >", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_money >=", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyLessThan(BigDecimal value) {
            addCriterion("goods_money <", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_money <=", value, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyIn(List<BigDecimal> values) {
            addCriterion("goods_money in", values, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("goods_money not in", values, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_money between", value1, value2, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_money not between", value1, value2, "goodsMoney");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultIsNull() {
            addCriterion("goods_isdefault is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultIsNotNull() {
            addCriterion("goods_isdefault is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultEqualTo(Integer value) {
            addCriterion("goods_isdefault =", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultNotEqualTo(Integer value) {
            addCriterion("goods_isdefault <>", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultGreaterThan(Integer value) {
            addCriterion("goods_isdefault >", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_isdefault >=", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultLessThan(Integer value) {
            addCriterion("goods_isdefault <", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("goods_isdefault <=", value, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultIn(List<Integer> values) {
            addCriterion("goods_isdefault in", values, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultNotIn(List<Integer> values) {
            addCriterion("goods_isdefault not in", values, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultBetween(Integer value1, Integer value2) {
            addCriterion("goods_isdefault between", value1, value2, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_isdefault not between", value1, value2, "goodsIsdefault");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidIsNull() {
            addCriterion("goods_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidIsNotNull() {
            addCriterion("goods_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidEqualTo(String value) {
            addCriterion("goods_nurseid =", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidNotEqualTo(String value) {
            addCriterion("goods_nurseid <>", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidGreaterThan(String value) {
            addCriterion("goods_nurseid >", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("goods_nurseid >=", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidLessThan(String value) {
            addCriterion("goods_nurseid <", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidLessThanOrEqualTo(String value) {
            addCriterion("goods_nurseid <=", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidLike(String value) {
            addCriterion("goods_nurseid like", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidNotLike(String value) {
            addCriterion("goods_nurseid not like", value, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidIn(List<String> values) {
            addCriterion("goods_nurseid in", values, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidNotIn(List<String> values) {
            addCriterion("goods_nurseid not in", values, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidBetween(String value1, String value2) {
            addCriterion("goods_nurseid between", value1, value2, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNurseidNotBetween(String value1, String value2) {
            addCriterion("goods_nurseid not between", value1, value2, "goodsNurseid");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIsNull() {
            addCriterion("goods_note is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIsNotNull() {
            addCriterion("goods_note is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteEqualTo(String value) {
            addCriterion("goods_note =", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotEqualTo(String value) {
            addCriterion("goods_note <>", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteGreaterThan(String value) {
            addCriterion("goods_note >", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("goods_note >=", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLessThan(String value) {
            addCriterion("goods_note <", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLessThanOrEqualTo(String value) {
            addCriterion("goods_note <=", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteLike(String value) {
            addCriterion("goods_note like", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotLike(String value) {
            addCriterion("goods_note not like", value, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteIn(List<String> values) {
            addCriterion("goods_note in", values, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotIn(List<String> values) {
            addCriterion("goods_note not in", values, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteBetween(String value1, String value2) {
            addCriterion("goods_note between", value1, value2, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsNoteNotBetween(String value1, String value2) {
            addCriterion("goods_note not between", value1, value2, "goodsNote");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminIsNull() {
            addCriterion("goods_createadmin is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminIsNotNull() {
            addCriterion("goods_createadmin is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminEqualTo(String value) {
            addCriterion("goods_createadmin =", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminNotEqualTo(String value) {
            addCriterion("goods_createadmin <>", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminGreaterThan(String value) {
            addCriterion("goods_createadmin >", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminGreaterThanOrEqualTo(String value) {
            addCriterion("goods_createadmin >=", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminLessThan(String value) {
            addCriterion("goods_createadmin <", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminLessThanOrEqualTo(String value) {
            addCriterion("goods_createadmin <=", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminLike(String value) {
            addCriterion("goods_createadmin like", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminNotLike(String value) {
            addCriterion("goods_createadmin not like", value, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminIn(List<String> values) {
            addCriterion("goods_createadmin in", values, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminNotIn(List<String> values) {
            addCriterion("goods_createadmin not in", values, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminBetween(String value1, String value2) {
            addCriterion("goods_createadmin between", value1, value2, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateadminNotBetween(String value1, String value2) {
            addCriterion("goods_createadmin not between", value1, value2, "goodsCreateadmin");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIsNull() {
            addCriterion("goods_createtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIsNotNull() {
            addCriterion("goods_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeEqualTo(Date value) {
            addCriterion("goods_createtime =", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotEqualTo(Date value) {
            addCriterion("goods_createtime <>", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeGreaterThan(Date value) {
            addCriterion("goods_createtime >", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_createtime >=", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeLessThan(Date value) {
            addCriterion("goods_createtime <", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_createtime <=", value, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeIn(List<Date> values) {
            addCriterion("goods_createtime in", values, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotIn(List<Date> values) {
            addCriterion("goods_createtime not in", values, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("goods_createtime between", value1, value2, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_createtime not between", value1, value2, "goodsCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeIsNull() {
            addCriterion("goods_updatime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeIsNotNull() {
            addCriterion("goods_updatime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeEqualTo(Date value) {
            addCriterion("goods_updatime =", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeNotEqualTo(Date value) {
            addCriterion("goods_updatime <>", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeGreaterThan(Date value) {
            addCriterion("goods_updatime >", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_updatime >=", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeLessThan(Date value) {
            addCriterion("goods_updatime <", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_updatime <=", value, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeIn(List<Date> values) {
            addCriterion("goods_updatime in", values, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeNotIn(List<Date> values) {
            addCriterion("goods_updatime not in", values, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeBetween(Date value1, Date value2) {
            addCriterion("goods_updatime between", value1, value2, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdatimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_updatime not between", value1, value2, "goodsUpdatime");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderIsNull() {
            addCriterion("goods_order is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderIsNotNull() {
            addCriterion("goods_order is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderEqualTo(Integer value) {
            addCriterion("goods_order =", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderNotEqualTo(Integer value) {
            addCriterion("goods_order <>", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderGreaterThan(Integer value) {
            addCriterion("goods_order >", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_order >=", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderLessThan(Integer value) {
            addCriterion("goods_order <", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderLessThanOrEqualTo(Integer value) {
            addCriterion("goods_order <=", value, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderIn(List<Integer> values) {
            addCriterion("goods_order in", values, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderNotIn(List<Integer> values) {
            addCriterion("goods_order not in", values, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderBetween(Integer value1, Integer value2) {
            addCriterion("goods_order between", value1, value2, "goodsOrder");
            return (Criteria) this;
        }

        public Criteria andGoodsOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_order not between", value1, value2, "goodsOrder");
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