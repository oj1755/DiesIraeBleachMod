
package net.mcreator.diesiraebleach.particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GetsuganomotoParticle {

	public static final BasicParticleType particle = new BasicParticleType(false);

	@SubscribeEvent
	public static void registerParticleType(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().register(particle.setRegistryName("getsuganomoto"));
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerParticle(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particles.registerFactory(particle, CustomParticleFactory::new);
	}

	@OnlyIn(Dist.CLIENT)
	private static class CustomParticle extends SpriteTexturedParticle {

		private final IAnimatedSprite spriteSet;
		private float angularVelocity;
		private float angularAcceleration;

		protected CustomParticle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz, IAnimatedSprite spriteSet) {
			super(world, x, y, z);
			this.spriteSet = spriteSet;

			this.setSize((float) 0.1, (float) 0.1);
			this.particleScale *= (float) 1;

			this.maxAge = 150;

			this.particleGravity = (float) 0;
			this.canCollide = true;

			this.motionX = vx * 1;
			this.motionY = vy * 1;
			this.motionZ = vz * 1;

			this.angularVelocity = (float) 5;
			this.angularAcceleration = (float) 0;

			this.selectSpriteWithAge(spriteSet);
		}

		@Override
		public IParticleRenderType getRenderType() {
			return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
		}

		@Override
		public void tick() {
			super.tick();

			this.prevParticleAngle = this.particleAngle;
			this.particleAngle += this.angularVelocity;
			this.angularVelocity += this.angularAcceleration;

			if (!this.isExpired) {
				this.setSprite(this.spriteSet.get((this.age / 300) % 1 + 1, 1));
			}

		}

	}

	@OnlyIn(Dist.CLIENT)
	private static class CustomParticleFactory implements IParticleFactory<BasicParticleType> {
		private final IAnimatedSprite spriteSet;

		public CustomParticleFactory(IAnimatedSprite spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new CustomParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

}
