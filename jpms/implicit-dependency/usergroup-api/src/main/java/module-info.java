import org.wildcraft.jpms.versioning.api.Version;

@Version(major = 1, minor = 0)
module org.wildcraft.jpms.implicit.usergroup.api {

    requires org.wildcraft.jpms.versioning.api;
    requires transitive org.wildcraft.jpms.implicit.user.api;

    //Provides & Consumes a Default provider.
    uses org.wildcraft.jpms.implicit.user.api.UserAPI;
    uses org.wildcraft.jpms.implicit.usergroup.api.provider.UserGroupServiceProvider;

    provides org.wildcraft.jpms.implicit.usergroup.api.provider.UserGroupServiceProvider with org.wildcraft.jpms.implicit.usergroup.api.provider.impl.UserGroupServiceProviderImpl;

    exports org.wildcraft.jpms.implicit.usergroup.api;
    exports org.wildcraft.jpms.implicit.usergroup.api.resources;
}