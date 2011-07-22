/*
 * Copyright 2000-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.buildServer.makerunner.agent.output;

import org.jetbrains.annotations.NotNull;

/**
 * @author Vladislav.Rassokhin
 */
class Target {
  @NotNull
  private final String myDirectory;
  @NotNull
  private final String myDescription;
  private final int myLevel;

  public Target(@NotNull final String directory, @NotNull final String description, final int level) {
    this.myDirectory = directory;
    this.myDescription = description;
    this.myLevel = level;
  }

  @NotNull
  public String getDirectory() {
    return myDirectory;
  }

  @NotNull
  public String getDescription() {
    return myDescription;
  }

  public int getLevel() {
    return myLevel;
  }
}
