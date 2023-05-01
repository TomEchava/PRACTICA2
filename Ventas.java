
public class Ventas {
    private String ORDERNUMBER;
    private String QUANTITYORDERED;
    private String PRICEEACH;
    private String ORDERLINENUMBER;
    private String SALES;
    private String ORDERDATE;
    private String STATUS;
    private String QTR_ID;
    private String MONTH_ID;
    private String YEAR_ID;
    private String PRODUCTLINE;
    private String MSRP;
    private String PRODUCTCODE;
    private String CUSTOMERNAME;
    private String PHONE;
    private String ADDRESSLINE1;
    private String ADDRESSLINE2;
    private String CITY;
    private String STATE;
    private String POSTALCODE;
    private String COUNTRY;
    private String TERRITORY;
    private String CONTACTLASTNAME;
    private String CONTACTFIRSTNAME;
    private String DEALSIZE;

    //constructor para inicializar los campos de cada registro
    public Ventas(String ORDERNUMBER, String QUANTITYORDERED, String PRICEEACH, String ORDERLINENUMBER, String SALES, String ORDERDATE, String STATUS, String QTR_ID, String MONTH_ID, String YEAR_ID, String PRODUCTLINE, String MSRP, String PRODUCTCODE, String CUSTOMERNAME, String PHONE, String ADDRESSLINE1, String ADDRESSLINE2, String CITY, String STATE, String POSTALCODE, String COUNTRY, String TERRITORY, String CONTACTLASTNAME, String CONTACTFIRSTNAME, String DEALSIZE) {
        this.ORDERNUMBER = ORDERNUMBER;
        this.QUANTITYORDERED = QUANTITYORDERED;
        this.PRICEEACH = PRICEEACH;
        this.ORDERLINENUMBER = ORDERLINENUMBER;
        this.SALES = SALES;
        this.ORDERDATE = ORDERDATE;
        this.STATUS = STATUS;
        this.QTR_ID = QTR_ID;
        this.MONTH_ID = MONTH_ID;
        this.YEAR_ID = YEAR_ID;
        this.PRODUCTLINE = PRODUCTLINE;
        this.MSRP = MSRP;
        this.PRODUCTCODE = PRODUCTCODE;
        this.CUSTOMERNAME = CUSTOMERNAME;
        this.PHONE = PHONE;
        this.ADDRESSLINE1 = ADDRESSLINE1;
        this.ADDRESSLINE2 = ADDRESSLINE2;
        this.CITY = CITY;
        this.STATE = STATE;
        this.POSTALCODE = POSTALCODE;
        this.COUNTRY = COUNTRY;
        this.TERRITORY = TERRITORY;
        this.CONTACTLASTNAME = CONTACTLASTNAME;
        this.CONTACTFIRSTNAME = CONTACTFIRSTNAME;
        this.DEALSIZE = DEALSIZE;
    }

    public String getORDERNUMBER() {
        return ORDERNUMBER;
    }

    public void setORDERNUMBER(String ORDERNUMBER) {
        this.ORDERNUMBER = ORDERNUMBER;
    }

    public String getQUANTITYORDERED() {
        return QUANTITYORDERED;
    }

    public void setQUANTITYORDERED(String QUANTITYORDERED) {
        this.QUANTITYORDERED = QUANTITYORDERED;
    }

    public String getPRICEEACH() {
        return PRICEEACH;
    }

    public void setPRICEEACH(String PRICEEACH) {
        this.PRICEEACH = PRICEEACH;
    }

    public String getORDERLINENUMBER() {
        return ORDERLINENUMBER;
    }

    public void setORDERLINENUMBER(String ORDERLINENUMBER) {
        this.ORDERLINENUMBER = ORDERLINENUMBER;
    }

    public String getSALES() {
        return SALES;
    }

    public void setSALES(String SALES) {
        this.SALES = SALES;
    }

    public String getORDERDATE() {
        return ORDERDATE;
    }

    public void setORDERDATE(String ORDERDATE) {
        this.ORDERDATE = ORDERDATE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getQTR_ID() {
        return QTR_ID;
    }

    public void setQTR_ID(String QTR_ID) {
        this.QTR_ID = QTR_ID;
    }

    public String getMONTH_ID() {
        return MONTH_ID;
    }

    public void setMONTH_ID(String MONTH_ID) {
        this.MONTH_ID = MONTH_ID;
    }

    public String getYEAR_ID() {
        return YEAR_ID;
    }

    public void setYEAR_ID(String YEAR_ID) {
        this.YEAR_ID = YEAR_ID;
    }

    public String getPRODUCTLINE() {
        return PRODUCTLINE;
    }

    public void setPRODUCTLINE(String PRODUCTLINE) {
        this.PRODUCTLINE = PRODUCTLINE;
    }

    public String getMSRP() {
        return MSRP;
    }

    public void setMSRP(String MSRP) {
        this.MSRP = MSRP;
    }

    public String getPRODUCTCODE() {
        return PRODUCTCODE;
    }

    public void setPRODUCTCODE(String PRODUCTCODE) {
        this.PRODUCTCODE = PRODUCTCODE;
    }

    public String getCUSTOMERNAME() {
        return CUSTOMERNAME;
    }

    public void setCUSTOMERNAME(String CUSTOMERNAME) {
        this.CUSTOMERNAME = CUSTOMERNAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setPOSTALCODE(String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getTERRITORY() {
        return TERRITORY;
    }

    public void setTERRITORY(String TERRITORY) {
        this.TERRITORY = TERRITORY;
    }

    public String getCONTACTLASTNAME() {
        return CONTACTLASTNAME;
    }

    public void setCONTACTLASTNAME(String CONTACTLASTNAME) {
        this.CONTACTLASTNAME = CONTACTLASTNAME;
    }

    public String getCONTACTFIRSTNAME() {
        return CONTACTFIRSTNAME;
    }

    public void setCONTACTFIRSTNAME(String CONTACTFIRSTNAME) {
        this.CONTACTFIRSTNAME = CONTACTFIRSTNAME;
    }

    public String getDEALSIZE() {
        return DEALSIZE;
    }

    public void setDEALSIZE(String DEALSIZE) {
        this.DEALSIZE = DEALSIZE;
    }

}
