package com.gwssi.ewindow.pojo.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpWarningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpWarningExample() {
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

        public Criteria andWarnidIsNull() {
            addCriterion("WARNID is null");
            return (Criteria) this;
        }

        public Criteria andWarnidIsNotNull() {
            addCriterion("WARNID is not null");
            return (Criteria) this;
        }

        public Criteria andWarnidEqualTo(String value) {
            addCriterion("WARNID =", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotEqualTo(String value) {
            addCriterion("WARNID <>", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidGreaterThan(String value) {
            addCriterion("WARNID >", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidGreaterThanOrEqualTo(String value) {
            addCriterion("WARNID >=", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidLessThan(String value) {
            addCriterion("WARNID <", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidLessThanOrEqualTo(String value) {
            addCriterion("WARNID <=", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidLike(String value) {
            addCriterion("WARNID like", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotLike(String value) {
            addCriterion("WARNID not like", value, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidIn(List<String> values) {
            addCriterion("WARNID in", values, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotIn(List<String> values) {
            addCriterion("WARNID not in", values, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidBetween(String value1, String value2) {
            addCriterion("WARNID between", value1, value2, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnidNotBetween(String value1, String value2) {
            addCriterion("WARNID not between", value1, value2, "warnid");
            return (Criteria) this;
        }

        public Criteria andWarnnameIsNull() {
            addCriterion("WARNNAME is null");
            return (Criteria) this;
        }

        public Criteria andWarnnameIsNotNull() {
            addCriterion("WARNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWarnnameEqualTo(String value) {
            addCriterion("WARNNAME =", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameNotEqualTo(String value) {
            addCriterion("WARNNAME <>", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameGreaterThan(String value) {
            addCriterion("WARNNAME >", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameGreaterThanOrEqualTo(String value) {
            addCriterion("WARNNAME >=", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameLessThan(String value) {
            addCriterion("WARNNAME <", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameLessThanOrEqualTo(String value) {
            addCriterion("WARNNAME <=", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameLike(String value) {
            addCriterion("WARNNAME like", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameNotLike(String value) {
            addCriterion("WARNNAME not like", value, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameIn(List<String> values) {
            addCriterion("WARNNAME in", values, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameNotIn(List<String> values) {
            addCriterion("WARNNAME not in", values, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameBetween(String value1, String value2) {
            addCriterion("WARNNAME between", value1, value2, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnnameNotBetween(String value1, String value2) {
            addCriterion("WARNNAME not between", value1, value2, "warnname");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIsNull() {
            addCriterion("WARNLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIsNotNull() {
            addCriterion("WARNLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andWarnlevelEqualTo(String value) {
            addCriterion("WARNLEVEL =", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotEqualTo(String value) {
            addCriterion("WARNLEVEL <>", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelGreaterThan(String value) {
            addCriterion("WARNLEVEL >", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelGreaterThanOrEqualTo(String value) {
            addCriterion("WARNLEVEL >=", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLessThan(String value) {
            addCriterion("WARNLEVEL <", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLessThanOrEqualTo(String value) {
            addCriterion("WARNLEVEL <=", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelLike(String value) {
            addCriterion("WARNLEVEL like", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotLike(String value) {
            addCriterion("WARNLEVEL not like", value, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelIn(List<String> values) {
            addCriterion("WARNLEVEL in", values, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotIn(List<String> values) {
            addCriterion("WARNLEVEL not in", values, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelBetween(String value1, String value2) {
            addCriterion("WARNLEVEL between", value1, value2, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnlevelNotBetween(String value1, String value2) {
            addCriterion("WARNLEVEL not between", value1, value2, "warnlevel");
            return (Criteria) this;
        }

        public Criteria andWarnuserIsNull() {
            addCriterion("WARNUSER is null");
            return (Criteria) this;
        }

        public Criteria andWarnuserIsNotNull() {
            addCriterion("WARNUSER is not null");
            return (Criteria) this;
        }

        public Criteria andWarnuserEqualTo(String value) {
            addCriterion("WARNUSER =", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserNotEqualTo(String value) {
            addCriterion("WARNUSER <>", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserGreaterThan(String value) {
            addCriterion("WARNUSER >", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserGreaterThanOrEqualTo(String value) {
            addCriterion("WARNUSER >=", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserLessThan(String value) {
            addCriterion("WARNUSER <", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserLessThanOrEqualTo(String value) {
            addCriterion("WARNUSER <=", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserLike(String value) {
            addCriterion("WARNUSER like", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserNotLike(String value) {
            addCriterion("WARNUSER not like", value, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserIn(List<String> values) {
            addCriterion("WARNUSER in", values, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserNotIn(List<String> values) {
            addCriterion("WARNUSER not in", values, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserBetween(String value1, String value2) {
            addCriterion("WARNUSER between", value1, value2, "warnuser");
            return (Criteria) this;
        }

        public Criteria andWarnuserNotBetween(String value1, String value2) {
            addCriterion("WARNUSER not between", value1, value2, "warnuser");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("TIMESTAMP =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("TIMESTAMP <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("TIMESTAMP >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("TIMESTAMP <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("TIMESTAMP <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("TIMESTAMP in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("TIMESTAMP not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("TIMESTAMP not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNull() {
            addCriterion("MINNUM is null");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNotNull() {
            addCriterion("MINNUM is not null");
            return (Criteria) this;
        }

        public Criteria andMinnumEqualTo(String value) {
            addCriterion("MINNUM =", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotEqualTo(String value) {
            addCriterion("MINNUM <>", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThan(String value) {
            addCriterion("MINNUM >", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThanOrEqualTo(String value) {
            addCriterion("MINNUM >=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThan(String value) {
            addCriterion("MINNUM <", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThanOrEqualTo(String value) {
            addCriterion("MINNUM <=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLike(String value) {
            addCriterion("MINNUM like", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotLike(String value) {
            addCriterion("MINNUM not like", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumIn(List<String> values) {
            addCriterion("MINNUM in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotIn(List<String> values) {
            addCriterion("MINNUM not in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumBetween(String value1, String value2) {
            addCriterion("MINNUM between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotBetween(String value1, String value2) {
            addCriterion("MINNUM not between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("MAXNUM is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("MAXNUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(String value) {
            addCriterion("MAXNUM =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(String value) {
            addCriterion("MAXNUM <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(String value) {
            addCriterion("MAXNUM >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(String value) {
            addCriterion("MAXNUM >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(String value) {
            addCriterion("MAXNUM <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(String value) {
            addCriterion("MAXNUM <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLike(String value) {
            addCriterion("MAXNUM like", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotLike(String value) {
            addCriterion("MAXNUM not like", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<String> values) {
            addCriterion("MAXNUM in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<String> values) {
            addCriterion("MAXNUM not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(String value1, String value2) {
            addCriterion("MAXNUM between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(String value1, String value2) {
            addCriterion("MAXNUM not between", value1, value2, "maxnum");
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