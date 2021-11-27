package com.example.demo.entity.generatePackage;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2021/05/17
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContractSignApproveInfo implements Serializable {
    /**
     */
    private Date xAuditTime;

    /**
     */
    private String xContractGUID;

    /**
     */
    private String xCrmWord;

    /**
     */
    private Integer xIsAudit;

    /**
     */
    private Integer xIsContractAudit;

    /**
     */
    private String xOrcWord;

    /**
     */
    private String xWordName;

    /**
     */
    private String contractSignApproveInfoGUID;

    /**
     */
    private String createdGUID;

    /**
     */
    private String createdName;

    /**
     */
    private Date createdTime;

    /**
     */
    private String modifiedGUID;

    /**
     */
    private String modifiedName;

    /**
     */
    private Date modifiedTime;

    /**
     */
    private Date versionNumber;

    /**
     */
    private String xWordReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x_s_contractsignapproveinfo
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", xAuditTime=").append(xAuditTime);
        sb.append(", xContractGUID=").append(xContractGUID);
        sb.append(", xCrmWord=").append(xCrmWord);
        sb.append(", xIsAudit=").append(xIsAudit);
        sb.append(", xIsContractAudit=").append(xIsContractAudit);
        sb.append(", xOrcWord=").append(xOrcWord);
        sb.append(", xWordName=").append(xWordName);
        sb.append(", contractSignApproveInfoGUID=").append(contractSignApproveInfoGUID);
        sb.append(", createdGUID=").append(createdGUID);
        sb.append(", createdName=").append(createdName);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", modifiedGUID=").append(modifiedGUID);
        sb.append(", modifiedName=").append(modifiedName);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", versionNumber=").append(versionNumber);
        sb.append(", xWordReason=").append(xWordReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}