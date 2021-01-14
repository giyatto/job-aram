package com.jobaram.model;

public class Score {
    private Integer semester;
    private Integer grade;
    private Long gradePct;
    private Integer ranking;
    private Long rankingPct;

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getGradePct() {
        return gradePct;
    }

    public void setGradePct(Long gradePct) {
        this.gradePct = gradePct;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Long getRankingPct() {
        return rankingPct;
    }

    public void setRankingPct(Long rankingPct) {
        this.rankingPct = rankingPct;
    }

}
