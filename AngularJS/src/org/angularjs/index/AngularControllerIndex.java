package org.angularjs.index;

import com.intellij.util.indexing.ID;
import org.jetbrains.annotations.NotNull;

/**
 * @author Dennis.Ushakov
 */
public class AngularControllerIndex extends AngularIndexBase {
  public static final ID<String, byte[]> INDEX_ID = ID.create("angularjs.controller.index");
  @NotNull
  @Override
  public ID<String, byte[]> getName() {
    return INDEX_ID;
  }
}
