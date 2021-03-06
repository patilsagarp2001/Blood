package com.bood_bank.bloodbank.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

public class StockAsPerOrganization {

    @Id
    private String _id;
    @NotBlank
    private String oid;
    @NotBlank
    private String bid;
    @Min(0)
    private int quantityAvl;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public int getQuantityAvl() {
        return quantityAvl;
    }

    public void setQuantityAvl(int quantityAvl) {
        this.quantityAvl = quantityAvl;
    }

}
