package com.github.pixelstuermer.junitcontainers.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

/**
 * Utility class to provide metadata of the library.
 */
public class MetadataProvider {

  private static final String BANNER_LOCATION = "/junitcontainers-banner.txt";
  private static final String BANNER_FALLBACK = "Using junitcontainers: https://github.com/pixelstuermer/junitcontainers";

  /**
   * Reads and returns the banner or the fallback if the resource cannot be read.
   *
   * @return The content of the banner
   */
  public String getBanner() {
    try {
      return IOUtils.toString(this.getClass()
                                  .getResourceAsStream(BANNER_LOCATION), StandardCharsets.UTF_8);
    } catch (IOException e) {
      return BANNER_FALLBACK;
    }
  }
}
