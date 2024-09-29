import mekanism.api.gas.Gas
import mekanism.common.FuelHandler
import mekanism.api.gas.GasRegistry

// create new gas
var diesel = new Gas(fluid('diesel').getFluid())
var kerosene = new Gas(fluid('kerosene').getFluid())
var gasoline = new Gas(fluid('fuel').getFluid())
var lpg = new Gas(fluid('lpg').getFluid())

// register gas to the registry (idk if this is necessary)
var dieselId = GasRegistry.register(diesel).registerFluid("diesel");
var keroseneId = GasRegistry.register(kerosene).registerFluid("kerosene");
var gasolineId = GasRegistry.register(gasoline).registerFluid("fuel");
var lpgId = GasRegistry.register(lpg).registerFluid("lpg");

// add the gas to the fuelhandler
FuelHandler.addGas(dieselId, 100, 3000)
FuelHandler.addGas(keroseneId, 100, 1000)
FuelHandler.addGas(gasolineId, 100, 5000)
FuelHandler.addGas(lpgId, 100, 20000)