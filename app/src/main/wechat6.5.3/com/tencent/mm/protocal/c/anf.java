package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class anf extends aqp {
    public int hOe;
    public int mNs;
    public LinkedList<arj> mjW = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.hOe);
            aVar.d(3, 8, this.mjW);
            aVar.dV(4, this.mNs);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return ((r0 + a.a.a.a.dS(2, this.hOe)) + a.a.a.a.c(3, 8, this.mjW)) + a.a.a.a.dS(4, this.mNs);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mjW.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            anf com_tencent_mm_protocal_c_anf = (anf) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anf.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_anf.hOe = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        arj com_tencent_mm_protocal_c_arj = new arj();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_arj.a(aVar4, com_tencent_mm_protocal_c_arj, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anf.mjW.add(com_tencent_mm_protocal_c_arj);
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_anf.mNs = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}