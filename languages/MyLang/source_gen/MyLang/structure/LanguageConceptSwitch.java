package MyLang.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Element = 0;
  public static final int Empty = 1;
  public static final int State = 2;
  public static final int StateMachine = 3;
  public static final int Transition = 4;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xc840535e42134a05L, 0x832f5cc528f47f6eL);
    builder.put(0x12c827797081e311L, Element);
    builder.put(0x12c827797085c707L, Empty);
    builder.put(0x12c827797080ae8fL, State);
    builder.put(0x12c827797081e306L, StateMachine);
    builder.put(0x12c827797081e30bL, Transition);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
