package com.webank.wecross.stub.bcos.common;

import com.webank.wecross.stub.BlockHeader;
import java.util.List;
import org.fisco.bcos.web3j.protocol.core.methods.response.BcosBlockHeader;

public class BCOSBlockHeader extends BlockHeader {
    private List<String> sealerList;
    private List<BcosBlockHeader.Signature> signatureList;

    public BCOSBlockHeader() {
        super();
    }

    public List<String> getSealerList() {
        return sealerList;
    }

    public void setSealerList(List<String> sealerList) {
        this.sealerList = sealerList;
    }

    public List<BcosBlockHeader.Signature> getSignatureList() {
        return signatureList;
    }

    public void setSignatureList(List<BcosBlockHeader.Signature> signatureList) {
        this.signatureList = signatureList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
