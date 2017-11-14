##The JPMS Modules has following sub Modules.

###1. simple-dependency
It exhibits, how dependencies can be made in JPMS.
<br/>
<br/>
One can see that neither the Top or the sub package of exported package is visible for other modules.

###2. spi
SPI - Service Provider Interfaces with factory and with public constructor.
<br/>
Scope of Service - Singleton, prototype, Factory Control and Life Cycle.

###3. automodule
It exhibits, how we can use external library (Guava) as auto-module.

It also shows that the testing of the module can be achieve with patching modules and adding exports and opens.

*For working with Auto Module, we require javac and java switches* <br/>

**--add-exports** for adding export<br/> 
**--add-opens** for adding opens<br/>
**--add-reads** for adding requires<br/>
**--patch-module** for patching module

###4. implicit-dependency
For library exposing an API, internally there can be many modules. The Clients of the library should not be in requirement to depend on all the modules.
i.e., Internal modularization need not be visible for other API users.
In these case implicit dependency is required.

Aggregate Modules with implicit dependency of all other required modules of the API, can be prepared for Client's use. So the client can depend on only one Aggregate Module per API.

###5. static-dependency
It exhibits static dependency between modules and transitive static dependency.

It can also be referred as compile time dependency or optional runtime dependency.

Compile time Annotation parser module may not required to be present at runtime, it is optional.
1. Transcompilation
2. Code Generation / Synthesis - try with resource / public constructor
3. Javadoc


####Approximate Optional Dependencies
Sometimes platform provided dependencies need not be included for packaging. One has to use SPI. 
Static can be used along with --add-module to approximate the Optional Dependency feature.

API Specific for Platform can be created with Optional Dependencies & Optional Transitive Dependencies.
They have to put in the public repository with respective platform.
Such APIs has to be used only after know which platforms it fits.

The only reason this combination of (transitive & static) modifiers is possible for API, is to enable modularization of legacy code using this pattern

###6. qualified-dependency
Non Public friendly module dependencies.
Safely Open Modules to only known frameworks.
Safely export Modules to only known Modules.

Create tight Dependency between Modules.


##Constraints

###7. split-Packages

###8. circular-dependency

###9. reflection

##Advanced

###10. layers
