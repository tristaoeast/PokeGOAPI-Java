package api;

import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors.Descriptor;

import main.Pokemon.PokemonProto;

public class PokemonDetails
{
	private PokemonProto proto;
	
	public PokemonDetails(PokemonProto proto)
	{
		this.proto = proto;
	}

	public PokemonProto getDefaultInstanceForType() {
		return proto.getDefaultInstanceForType();
	}

	public long getId() {
		return proto.getId();
	}

	public int getPokemonId() {
		return proto.getPokemonId();
	}

	public int getCp() {
		return proto.getCp();
	}

	public int getStamina() {
		return proto.getStamina();
	}

	public int getMaxStamina() {
		return proto.getMaxStamina();
	}

	public int getMove1() {
		return proto.getMove1();
	}

	public int getMove2() {
		return proto.getMove2();
	}

	public String getDeployedFortId() {
		return proto.getDeployedFortId();
	}

	public String getOwnerName() {
		return proto.getOwnerName();
	}

	public boolean getIsEgg() {
		return proto.getIsEgg();
	}

	public double getEggKmWalkedTarget() {
		return proto.getEggKmWalkedTarget();
	}

	public double getEggKmWalkedStart() {
		return proto.getEggKmWalkedStart();
	}

	public int getOrigin() {
		return proto.getOrigin();
	}

	public float getHeightM() {
		return proto.getHeightM();
	}

	public int getIndividualAttack() {
		return proto.getIndividualAttack();
	}

	public int getIndividualDefense() {
		return proto.getIndividualDefense();
	}

	public int getIndividualStamina() {
		return proto.getIndividualStamina();
	}

	public float getCpMultiplier() {
		return proto.getCpMultiplier();
	}

	public int getPokeball() {
		return proto.getPokeball();
	}

	public long getCapturedS2CellId() {
		return proto.getCapturedS2CellId();
	}

	public int getBattlesAttacked() {
		return proto.getBattlesAttacked();
	}

	public int getBattlesDefended() {
		return proto.getBattlesDefended();
	}

	public String getEggIncubatorId() {
		return proto.getEggIncubatorId();
	}

	public ByteString getEggIncubatorIdBytes() {
		return proto.getEggIncubatorIdBytes();
	}

	public long getCreationTimeMs() {
		return proto.getCreationTimeMs();
	}

	public Descriptor getDescriptorForType() {
		return proto.getDescriptorForType();
	}

	public boolean getFavorite() {
		return proto.getFavorite();
	}

	public String getNickname() {
		return proto.getNickname();
	}

	public boolean getFromFort() {
		return proto.getFromFort();
	}
	
	
}
