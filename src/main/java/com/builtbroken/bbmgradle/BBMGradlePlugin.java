package com.builtbroken.bbmgradle;

import com.energizedwork.gradle.idea.IdeaBasePlugin;
import com.matthewprenger.cursegradle.CurseGradlePlugin;
import net.minecraftforge.gradle.common.BasePlugin;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Hennamann(Ole Henrik Stabell) on 20/03/2018.
 */
public class BBMGradlePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getPluginManager().apply(BasePlugin.class); // ForgeGradle
        project.getPluginManager().apply(CurseGradlePlugin.class); // CurseGradle
        project.getPluginManager().apply(IdeaBasePlugin.class); // IDEA Plugins
    }
}