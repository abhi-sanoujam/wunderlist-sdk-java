package com.sanoujam.wunderlist;

import com.sanoujam.wunderlist.operations.WLListOperations;
import com.sanoujam.wunderlist.operations.WLTaskOperations;

public interface WunderlistClient {

  /**
   * Get list operations api
   *
   * @return WLListOperations
   */
  WLListOperations listOperations();

  /**
   * Get tasks operations api
   *
   * @return WLTaskOperations
   */
  WLTaskOperations taskOperations();
}
