package com.play.jcslib.bookstore2.vo;

public class BookVo {
    
    private String book_id; // 도서pk
    private String cat_id; // 카테고리id
    private String book_nm; // 도서명
    private String author_id; // 작가
    private String pb_id; // 출판사id
    private int price; // 정가
    private String pb_date; // 발행일(출판일)
    private String book_img; // 이미지 경로
    private String pages; // 쪽수
    private String volume; // 권수
    private String book_intro; // 도서소개
    private String rmk; // 비고
    private String rgr_id; // 등록자id
    private String rgr_dtti; // 등록일시
    private String ch_id; // 수정자
    private String ch_dtti; // 수정일시

    public String getBook_id() {
        return book_id;
    }
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }
    public String getCat_id() {
        return cat_id;
    }
    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }
    public String getBook_nm() {
        return book_nm;
    }
    public void setBook_nm(String book_nm) {
        this.book_nm = book_nm;
    }
    public String getAuthor_id() {
        return author_id;
    }
    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }
    public String getPb_id() {
        return pb_id;
    }
    public void setPb_id(String pb_id) {
        this.pb_id = pb_id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getPb_date() {
        return pb_date;
    }
    public void setPb_date(String pb_date) {
        this.pb_date = pb_date;
    }
    public String getBook_img() {
        return book_img;
    }
    public void setBook_img(String book_img) {
        this.book_img = book_img;
    }
    public String getPages() {
        return pages;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getBook_intro() {
        return book_intro;
    }
    public void setBook_intro(String book_intro) {
        this.book_intro = book_intro;
    }
    public String getRmk() {
        return rmk;
    }
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }
    public String getRgr_id() {
        return rgr_id;
    }
    public void setRgr_id(String rgr_id) {
        this.rgr_id = rgr_id;
    }
    public String getRgr_dtti() {
        return rgr_dtti;
    }
    public void setRgr_dtti(String rgr_dtti) {
        this.rgr_dtti = rgr_dtti;
    }
    public String getCh_id() {
        return ch_id;
    }
    public void setCh_id(String ch_id) {
        this.ch_id = ch_id;
    }
    public String getCh_dtti() {
        return ch_dtti;
    }
    public void setCh_dtti(String ch_dtti) {
        this.ch_dtti = ch_dtti;
    }

}
